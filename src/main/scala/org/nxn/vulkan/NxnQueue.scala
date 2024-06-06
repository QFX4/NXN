package org.nxn.vulkan

import org.lwjgl.system.MemoryStack
import org.lwjgl.vulkan.{VK10, VkQueue}
import org.nxn.Extensions.*

class NxnQueue(val device:NxnDevice, val index:Int) extends NxnContext {
  override val engine: NxnEngine = device.engine

  if(index >= device.queuesFamilies.size){
    throw new IndexOutOfBoundsException(index)
  }

  protected def init(): VkQueue = MemoryStack.stackPush() | { stack =>
    val p = stack.callocPointer(1)
    VK10.vkGetDeviceQueue(device.vkDevice, device.queuesFamilies(index), index, p)
    new VkQueue(p.get(0), device.vkDevice)
  }

  val vkQueue:VkQueue = init()

}
