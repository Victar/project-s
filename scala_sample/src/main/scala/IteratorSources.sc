object IteratorSources {

  println("Scala Worksheet")

  case class TempData(stateId:String, year:Int, month :Int)

  def parseLine(line:String):TempData = {
//    println(s"parse: $line" )
    val p = line.split(",").map(_.trim)
    TempData(p(0), p(1).toInt, p(2).toInt)
  }

  val source = io.Source.fromFile("C:\\Users\\viktor.kadol\\Downloads\\TX410120_4098.csv")

  val lines =source.getLines()

  lines.next
  lines.next
  parseLine(lines.next)

  val data = lines.map(parseLine).toArray

  source.close

}