package main.scala.mud.mutable

/**
  * Created by viktor.kadol on 26.11.15.
  */
trait Character {

  val name:String
  def items: List[Item]
  def currentRoom: String

}
