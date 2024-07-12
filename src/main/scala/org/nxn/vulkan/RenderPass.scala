package org.nxn.vulkan

import org.lwjgl.system.MemoryStack
import org.lwjgl.vulkan.{KHRSwapchain, VK10, VkAttachmentDescription, VkAttachmentReference, VkRenderPassCreateInfo, VkSubpassDependency, VkSubpassDescription}
import org.nxn.utils.Using.*

class RenderPass(val swapChain: SwapChain)  extends AutoCloseable{

  protected def initRenderPass(): Long = MemoryStack.stackPush() | { stack =>
    val attachments = VkAttachmentDescription.calloc(1, stack)
    attachments.get(0)
      .flags(0)
      .format(swapChain.format)
      .samples(VK10.VK_SAMPLE_COUNT_1_BIT)
      .loadOp(VK10.VK_ATTACHMENT_LOAD_OP_CLEAR)
      .storeOp(VK10.VK_ATTACHMENT_STORE_OP_STORE)
      .stencilLoadOp(VK10.VK_ATTACHMENT_LOAD_OP_DONT_CARE)
      .stencilStoreOp(VK10.VK_ATTACHMENT_STORE_OP_DONT_CARE)
      .initialLayout(VK10.VK_IMAGE_LAYOUT_UNDEFINED)
      .finalLayout(KHRSwapchain.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR)

    val colorRef = VkAttachmentReference.calloc(1, stack)
      .layout(VK10.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
      .attachment(0)

    val subPasses = VkSubpassDescription.calloc(1, stack)
      .pipelineBindPoint(VK10.VK_PIPELINE_BIND_POINT_GRAPHICS)
      .colorAttachmentCount(1)
      .pColorAttachments(colorRef)

    val dep = VkSubpassDependency.calloc(1, stack)
    dep.get(0)
      .srcSubpass(VK10.VK_SUBPASS_EXTERNAL)
      .srcStageMask(VK10.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT)
      .srcAccessMask(0)
      .dstSubpass(0)
      .dstStageMask(VK10.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT)
      .dstAccessMask(VK10.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT)

    val info = VkRenderPassCreateInfo.calloc(stack)
      .sType$Default()
      .pSubpasses(subPasses)
      .pAttachments(attachments)
      .pDependencies(dep)

    val buff = stack.callocLong(1)
    vkCheck(VK10.vkCreateRenderPass(swapChain.device.vkDevice, info, null, buff))
    buff.get(0)
  }

  val vkRenderPass: Long = initRenderPass()

  protected def initFrameBuffers():IndexedSeq[FrameBuffer] = {
    for(i <- swapChain.imageViews) yield new FrameBuffer(this, i)
  }

  val frameBuffers:IndexedSeq[FrameBuffer] = initFrameBuffers()

  override def close(): Unit = {
    for(i <- frameBuffers) i.close()
    VK10.vkDestroyRenderPass(swapChain.device.vkDevice, vkRenderPass, null)
  }

}