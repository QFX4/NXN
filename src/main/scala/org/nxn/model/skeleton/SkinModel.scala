package org.nxn.model.skeleton

import org.nxn.model.{Vertex, VertexModel}

object SkinModel{

  def apply(name:String, m:VertexModel):SkinModel = {
    new SkinModel(name, m.vertexes, m.indexesCount)
  }

}

class SkinModel(val name:String, vertexes: Array[Vertex], override val indexesCount:Int) extends VertexModel(vertexes)
