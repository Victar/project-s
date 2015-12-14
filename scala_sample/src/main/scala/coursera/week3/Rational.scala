package coursera.week3

/**
  * Created by viktor.kadol on 14.12.15.
  */
class Rational(x: Int, y: Int) {

  require(y != 0, "denominator must be non zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private def g = gcd(x, y)

  def numer = x / g

  def denom = y / g

  def <(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this < that) that else this

  def +(that: Rational): Rational =
    new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

  def -(that: Rational): Rational =
    this + -that

  def unary_- : Rational =
    new Rational(-numer, denom)


  override def toString() =
    numer + "/" + denom

}