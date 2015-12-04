object SyntacticSugar{
  val a = Array(1,2,3,4)

  a foreach println
  Array.fill(5){"d"}
  def myWhile(cond: => Boolean)(body : => Unit):Unit ={
    if (cond){
      body
      myWhile(cond)(body)
    }
  }

  var i=0

  myWhile(i<5){
    println(i)
    i +=1
  }
}