object rationals {

  println("Welcome to the Scala worksheet")
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.sub(y).sub(z)
  y.add(y)
  x.less(y)
  x.max(y)



  class Rational(x: Int, y: Int) {

    require(y!=0, "denominator must be non zero")



    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    private def g = gcd(x, y)

    def numer = x / g

    def denom = y / g

    def less(that: Rational) = this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
      if (this.less(that)) that else this

    def add(that: Rational): Rational =
      new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

    def sub(that: Rational): Rational =
      add(that.neg())

    def neg(): Rational =
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
