package main.scala.mud.mutable

/**
  * Created by viktor.kadol on 26.11.15.
  */
object Player {


}

class Player (val name:String, private var mItems: List[Item], private var mCurrentRoom: String) extends Character {
  def process(input:String, rooms:Map[String, Room]) : Unit = {
  }

  override def items: List[Item] = mItems

  override def currentRoom: String = mCurrentRoom
}