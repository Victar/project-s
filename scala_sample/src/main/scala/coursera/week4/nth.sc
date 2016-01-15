import coursera.week3._
import coursera.week4._

object nth {
  def nth[T](n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(2, list)

  //  nth(4,list)

  //  nth(-1,list)
  class AnonFun extends Function1[Int, Int] {
    def apply(x: Int) = x * x
  }

  def anon = new AnonFun

  def anonShort = (x: Int) => x * x

  anon(3)
  anonShort(3)

}