package org.nxn

import org.nxn.Extensions.*
import org.nxn.utils.Dimension
import org.nxn.vulkan.{GeInstance, GeSystem, GeWindow}

import scala.util.control.NonFatal

object Main {

  def main(args:Array[String]) : Unit = {
    try {
      new GeSystem(true, "NXN", Dimension(1280, 720)) | { sys =>
        new GeWindow(sys) | { win =>
          new GeInstance(sys) | { inst =>

            while (win.pullEvents()) {

            }

          }

        }
      }
    }catch {
      case NonFatal(e) =>
        e.printStackTrace()
    }
  }

}