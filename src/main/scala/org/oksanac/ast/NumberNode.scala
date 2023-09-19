package org.oksanac.ast

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes._
import org.oksanac.SymbolTable

case class NumberNode(number: Int) extends OperandNode {
  def generate(mv: MethodVisitor, symbolTable: SymbolTable) {
    mv.visitIntInsn(SIPUSH, number)
  }
}
