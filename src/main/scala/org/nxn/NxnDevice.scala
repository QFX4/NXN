package org.nxn

import org.lwjgl.system.{MemoryStack, MemoryUtil}
import org.lwjgl.vulkan.{KHRSwapchain, VK10, VkDevice, VkDeviceCreateInfo, VkDeviceQueueCreateInfo, VkPhysicalDeviceFeatures}
import org.nxn.*

class NxnDevice(val physicalDevice:NxnPhysicalDevice, val queuesFamilies:Seq[Int]) extends NxnContext, AutoCloseable{
  override val engine: NxnEngine = physicalDevice.engine

  val vkDevice:VkDevice = MemoryStack.stackPush() | { stack =>
    val queue = VkDeviceQueueCreateInfo.calloc(queuesFamilies.size, stack)
    val priorities = stack.callocFloat(queuesFamilies.size)
    for(i <- queuesFamilies.zipWithIndex) {
      queue.get(i._2)
        .sType$Default()
        .queueFamilyIndex(i._1)
        .pQueuePriorities(priorities)
        .pNext(MemoryUtil.NULL)
        .flags(0)
    }

    val deviceFeatures = VkPhysicalDeviceFeatures.calloc(stack)
    VK10.vkGetPhysicalDeviceFeatures(physicalDevice.vkPhysicalDevice, deviceFeatures)

    val enabledFeatures = VkPhysicalDeviceFeatures.calloc(stack)
    features(deviceFeatures, enabledFeatures)

    val extNm = stack.callocPointer(1)
    extNm.put(MemoryUtil.memASCII(KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME))
    extNm.flip()

    val devInf = VkDeviceCreateInfo.calloc(stack)
      .sType$Default()
      .pQueueCreateInfos(queue)
      .ppEnabledLayerNames(null)
      .pEnabledFeatures(enabledFeatures)
      .ppEnabledExtensionNames(extNm)
      .pNext(MemoryUtil.NULL)
      .flags(0)

    val buff = stack.callocPointer(1)
    vkCheck(VK10.vkCreateDevice(physicalDevice.vkPhysicalDevice, devInf, null, buff))

    new VkDevice(buff.get(0), physicalDevice.vkPhysicalDevice, devInf)
  }

  def features(deviceFeatures:VkPhysicalDeviceFeatures, enabled:VkPhysicalDeviceFeatures) : Unit = {
    // ??
  }

  override def close(): Unit = {
    VK10.vkDestroyDevice(vkDevice, null)
  }

}
