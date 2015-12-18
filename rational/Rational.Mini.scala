class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer +"/"+ denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
}

val y = new Rational(3,2)
val x = new Rational(1,2)
val sumrat = y.add(x)
val lessthan = y.lessThan(x)
val max = y.max(x)
println(y + " + " + x + " = " + sumrat)
println(y + " is less than " + x + " is " + lessthan)
println("max = " + max)

