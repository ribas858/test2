package codes

package object MulEvals {
  class Mul(l: Eval.Expression, r: Eval.Expression) extends Mul.GMul with Eval.Expression {
    type T = Eval.Expression
    lhs = l
    rhs = r

    override def eval(): Int = lhs.eval() * rhs.eval()
  }
}
