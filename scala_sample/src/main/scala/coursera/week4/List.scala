package coursera.week4


/**
  * Created by viktor.kadol on 14.12.15.
  */
trait List[T] {

  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def tail: Nothing = throw new NoSuchElementException("Nil.head")

  override def head: Nothing = throw new NoSuchElementException("Nil.head")
}

object List {

  def apply[T](x1: T, x2: T): List[T] =
    new Cons(x1, new Cons(x2, new Nil))

  def apply[T](x1: T): List[T] =
    new Cons(x1, new Nil)

  def apply[T](): List[T] =
    new Nil

}


