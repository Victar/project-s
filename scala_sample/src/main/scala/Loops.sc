object Loops {

  val a = Array.fill(5)(math.random)

  for (x <- a) yield x*x

  a.map(x => x*x)

  for (i <- (0 until 5).par
       if i%2 == 0;
       j <- 5 until 10) yield (i,j)

  def foo(i:Int):Int = ???

  val pf:PartialFunction[Any,String] = {
    case i:Int => "Number"
    case s:String => "The string " + s
    case s:Double => s"Double $s"
  }

  pf(5)
  pf("Hello")
  pf(2.3)
}