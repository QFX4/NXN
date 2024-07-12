package org.nxn.vulkan

import org.lwjgl.system.MemoryStack
import org.lwjgl.vulkan.{VK10, VkMemoryAllocateInfo, VkMemoryRequirements}
import org.nxn.utils.Using.*
import org.nxn.vulkan.memory.MemoryBuffer

import java.util.function.Consumer

abstract class Memory(val device: Device, val size:Int) extends AutoCloseable{

  trait MemoryCallback{
    def requirements(memReq:VkMemoryRequirements):Unit
    def bind(mem:Long):Unit
  }

  def vkMemory: Long

  protected def initMemory(reqMask:Int)(fn:MemoryCallback) : Long = MemoryStack.stackPush() | { stack =>
    val dev = device.physicalDevice

    val memReq = VkMemoryRequirements.calloc(stack)
    fn.requirements(memReq)

    val typeBits = memReq.memoryTypeBits()

    var memoryTypeIndex = -1
    val memTypes = dev.memoryTypes
    for (i <- memTypes.indices if memoryTypeIndex == -1) {
      if ((typeBits & (1 << i)) != 0 && (memTypes(i).propertyFlags & reqMask) == reqMask) {
        memoryTypeIndex = i
      }
    }

    if (memoryTypeIndex == -1) {
      throw new RuntimeException("memoryTypeIndex not found")
    }

    val allocInfo = VkMemoryAllocateInfo.calloc(stack)
      .sType$Default()
      .allocationSize(memReq.size())
      .memoryTypeIndex(memoryTypeIndex)

    val lp = stack.callocLong(1)
    vkCheck(VK10.vkAllocateMemory(device.vkDevice, allocInfo, null, lp))
    val mem = lp.get(0)
    fn.bind(mem)
    mem
  }

  def map(c:Consumer[MemoryBuffer]):this.type = MemoryStack.stackPush() | { stack =>

    val pb = stack.callocPointer(1)
    vkCheck(VK10.vkMapMemory(device.vkDevice, vkMemory, 0, size, 0, pb))
    val mappedMemory = pb.get(0)

    try {
      c.accept(MemoryBuffer(mappedMemory, size))
    }finally {
      VK10.vkUnmapMemory(device.vkDevice, vkMemory)
    }

    this
  }

  override def close(): Unit = {
    VK10.vkFreeMemory(device.vkDevice, vkMemory, null)
  }

}