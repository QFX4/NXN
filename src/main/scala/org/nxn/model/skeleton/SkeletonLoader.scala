package org.nxn.model.skeleton

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import org.nxn.model.ExceptionErrorListener
import org.nxn.model.skeleton.parser.{SkeletonLexer, SkeletonParser}

import java.io.InputStream
import java.nio.charset.StandardCharsets

class SkeletonLoader extends ExceptionErrorListener{

  def loadSkeleton(in: InputStream): ParsedJoint = {
    val p = SkeletonParser(CommonTokenStream(SkeletonLexer(CharStreams.fromStream(in, StandardCharsets.UTF_8))))
    p.removeErrorListeners()
    p.addErrorListener(this)
    p.skeleton().result
  }

}
