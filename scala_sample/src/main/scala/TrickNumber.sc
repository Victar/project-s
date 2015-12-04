object TrickNumber {

  def cube(x:Int) :Int= x*x*x;

  def check (x:Int, y:Int, z:Int) =  {
    val summ = x*1000*1000 + y*1000 + z
    var cube1 = cube(x) + cube(y) + cube(z)
    if (summ==cube1) println(summ)
  }

  cube(5)

  var x = 0
  var y = 0
  var z = 0
  for (x <- 1 to 1000){
    for (y <- 1 to 1000){
      for (z <- 1 to 1000){
        check(x,y,z)
      }
    }
  }


}