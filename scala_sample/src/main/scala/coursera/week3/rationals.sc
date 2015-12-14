import coursera.week3.Rational

object rationals {
  println("Welcome to the Scala worksheet")
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x - y - z
  y + y
  x < y
  x max y



  def addRational(r: Rational, s: Rational): Rational =
    new Rational(r.numer * s.denom + s.numer * r.denom, r.denom * s.denom)

  def makeString(r: Rational): String =
    r.numer + "/" + r.denom

  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
}
