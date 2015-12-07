import scala.annotation.tailrec

object Session {

  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) < x / 1000
    def improve(guess: Double) =
      (guess + x / guess) / 2
    sqrtIter(1.0)
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def factorial (n :Int) :Int = {
    def loop(acc : Int, n :Int) : Int =
      if (n==0) acc
      else loop(acc *n, n-1)

    loop(1, n)
  }

  gcd( 14, 21)
  factorial(5)

  sqrt(2)
  sqrt(4)
  sqrt(9)
  sqrt(16)
  sqrt(1e-6)
  sqrt(1e60)
  val x = 0

  def f(y: Int) = y + 1

  val result = {
    val x = f(3)
    x * x
  } + x

}