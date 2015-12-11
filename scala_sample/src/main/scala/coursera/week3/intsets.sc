object instsets {

  println("Scala worksheet week3")

  val t1 = new NonEmpty(3, Empty, Empty)
  val t2 = t1 incl 6
  val t3 = t2 incl 1
  val p1 = new NonEmpty(5, Empty, Empty)
  val p2 = t3.union(p1)

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

}