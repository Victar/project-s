package coursera.week3

/**
  * Created by viktor.kadol on 11.12.15.
  */
object Hello {

  def main(args: Array[String]) =
    println("Hello")
}

abstract class Base {
  def foo = 1
  def bar: Int
}
class Sub extends Base {
  override def foo = 2

  def bar = 3
}

abstract class IntSet {

  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet
}

object Empty extends IntSet {

  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  override def union(other: IntSet): IntSet = other
  override def toString = "."

}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  override def union(other: IntSet): IntSet = {
    println("Union this: " + this + " other " + other)
    ((left union right) union other) incl elem
  }

  override def toString = "{" + left + elem + right + "}"

}
