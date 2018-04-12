import codes.Core
import codes.Eval
import codes.Add
import codes.AddEval
import codes.Sub
import codes.Mul
import codes.SubEval

object Main extends App {
  val lit100 = new Core.Literal(100) with Eval.Literal
  val lit500 = new Core.Literal(500) with Eval.Literal

  val sum = new Add.Add(lit100, lit500) 

  println(sum.print())
  println(lit100.eval())

   val subtration = new Sub.Sub(lit100, lit500) 

  println(subtration.print())
  println(lit100.eval())

   val multi = new Mul.Mul(lit100, lit500) 

  println(multi.print())
  println(lit100.eval())
}