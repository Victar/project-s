package akkacode

import akka.actor.{Props, ActorSystem, Actor}
import akka.actor.Actor.Receive

/**
  * Created by viktor.kadol on 27.11.15.
  */
object SimpleExample extends App {

  class SimpleActor extends Actor {
    def receive = {
      case s: String => println("String " + s)
      case i: Int => println("Int " + i)
      case _ => println("Unknown message")
    }
    //    def foo(){}
  }

  var system = ActorSystem("SimpleExample")
  var actor = system.actorOf(Props[SimpleActor], "FirstActor")

  actor ! "Hi"
  actor ! 42
  actor ! 'a'

  system.shutdown()
}
