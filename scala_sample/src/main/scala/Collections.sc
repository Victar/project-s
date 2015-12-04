object Collections{
  val arr = Array(1,2,3)
  val lst = List(7.2,2,3)

  arr(0)

  //arr(2)=4

  var lst2 = 1::lst


  val arr2 = Array.fill(10)(math.random)

  arr2.length

  val arr3 = Array.tabulate(10)(i=>i*i*i)

  arr++:(arr2)

  arr
  arr.reverse

  val arr4 = Array(1,3,5,7,9)

  arr4.mkString("(",", ", ")")

}