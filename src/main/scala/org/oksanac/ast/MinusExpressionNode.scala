package org.oksanac.ast

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes._
import org.oksanac.SymbolTable

case class MinusExpressionNode(expression: AstNode, operand: AstNode) extends AstNode {
  def generate(mv: MethodVisitor, symbolTable: SymbolTable) {
    expression.generate(mv, symbolTable)
    operand.generate(mv, symbolTable)
    mv.visitInsn(ISUB)
  }
}
