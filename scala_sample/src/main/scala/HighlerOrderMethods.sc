import java.io.File

object HighlerOrderMethods {

  val a = Array(1, 2, 3, 4, 5)
  val b = List(5, 2, 8, 1, 9, 3, 6, 9)
  val c = Vector.tabulate(10)(i => i * i)

  a.foreach(println)

  a.map(i => i * 2)
  a.map(_ * 2.0)

  b.filter(_ < 5)

  a.flatMap(i => b.take(i))

  c.exists(_ > 50)
  c.forall(_ < 100)

  a.reduceLeft(_ * _)

  b.find(_ % 3 == 0).map(_ / 3).getOrElse(0)

  new File(".").getAbsolutePath

  val source = io.Source.fromFile("C:\\Users\\viktor.kadol\\Downloads\\TX410120_4098.csv")

  val lines = source.getLines()

  lines.next
  lines.next


  source.close
}