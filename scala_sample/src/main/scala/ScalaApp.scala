import scala.collection.immutable.HashMap

/**
  * Created by viktor.kadol on 10.11.15.
  */
object ScalaApp {

  def main(args: Array[String]) {

    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    capital += ("France" -> "Lyon")
//    capital = HashMap("France" -> "Lyon")
    println(capital("France"))
    println(capital("Japan"))
    println(capital("Japan"))
  }


}
