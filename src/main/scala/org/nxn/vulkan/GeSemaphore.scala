package org.nxn.vulkan

import org.lwjgl.system.MemoryStack
import org.lwjgl.vulkan.{VK10, VkSemaphoreCreateInfo}
import org.nxn.Extensions.*

class GeSemaphore(val device: GeDevice) extends GeContext, AutoCloseable{
  override val system: GeSystem = device.system

  protected def init():Long = MemoryStack.stackPush() | { stack =>
    val info = VkSemaphoreCreateInfo.calloc(stack)
      .sType$Default()

    val buff = stack.callocLong(1)
    vkCheck(VK10.vkCreateSemaphore(device.vkDevice, info, null, buff))
    buff.get(0)
  }

  val vkSemaphore:Long = init()

  override def close(): Unit = {
    VK10.vkDestroySemaphore(device.vkDevice, vkSemaphore, null)
  }
}