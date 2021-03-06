package codes

package object Add {
  trait GAdd extends Core.Expression {
    type T <: Core.Expression           //abstract type in Scala
    var lhs: T = _ 
    var rhs: T = _ 
    override def print(): String = "(" + lhs.print() + " + " + rhs.print() + ")" 
  }

  class Add(l: Core.Expression, r: Core.Expression) extends GAdd {
    type T = Core.Expression

    lhs = l
    rhs = r
  }
}

