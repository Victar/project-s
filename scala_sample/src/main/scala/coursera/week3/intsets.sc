import coursera.week3.NonEmpty

object instsets {

  println("Scala worksheet week3")
  import  coursera.week3.Empty
  val t1 = new NonEmpty(3, Empty, Empty)
  val t2 = t1 incl 6
  val t3 = t2 incl 1
  val p1 = new NonEmpty(5, Empty, Empty)
  val p2 = t3.union(p1)
}
