object rationals {

  println("Welcome to the Scala worksheet")
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x - y - z
  y + y
  x < y
  x max y


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

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(r.numer * s.denom + s.numer * r.denom, r.denom * s.denom)

  def makeString(r: Rational): String =
    r.numer + "/" + r.denom

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
}
