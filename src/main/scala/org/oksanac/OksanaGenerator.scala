package org.oksanac

import org.oksanac.ast.RootNode


class OksanaGenerator extends ClassLoader {

  def generate(oksanaCode: String, filename: String): (Array[Byte], RootNode) = {
    val parser = new OksanaParser
    val rootNode = parser.parse(oksanaCode)
    (rootNode.generateByteCode(filename), rootNode)
  }
}
