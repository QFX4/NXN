package org.nxn.model

import org.nxn.math.{Axis, Vector2f, Vector3f}

class ParsedVertex(val index:Int, val normal:Vector3f, val uvs:Array[Vector2f]){

  def invert(a:Axis):this.type = {
    a(normal) = -1f * a(normal)
    this
  }

}
