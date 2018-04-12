package codes

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.BeforeAndAfter


class TestMul extends FlatSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  behavior of "An Mul expression"

  var literal100: Eval.Literal = _
  var literal200: Eval.Literal = _

  before {
    literal100 = new Core.Literal(100) with Eval.Literal
    literal200 = new Core.Literal(200) with Eval.Literal
  }

  it should "return String (100 * 200) when we call Mul(Literal(100), Literal(200).print())" in {
    val mul = new MulEval.Mul(literal100, literal200)
  
    mul.print() should be ("(100 * 200)")
  }

  it should "return 20000 when we call call Mul(Literal(100), Literal(200)).eval()" in {
    val mul = new MulEval.Mul(literal100, literal200)

    mul.eval() should be (20000)
  }
}
