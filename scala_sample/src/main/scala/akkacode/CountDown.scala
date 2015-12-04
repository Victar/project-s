package akkacode

import akka.actor.Actor.Receive
import akka.actor.{Props, ActorSystem, Actor, ActorRef}

/**
  * Created by viktor.kadol on 27.11.15.
  */
object CountDown extends App{

  case class StartCounting(n: Int, partner:ActorRef)
  case class Count (n:Int)

  class CountDownActor extends Actor {
    override def receive = {
      case StartCounting(n,o) =>
        println(n)
        o ! Count(n-1)
      case Count(n) =>
        if (n>0){
          println(n)
          Thread.sleep(1000)
          sender ! Count(n-1)
        }else{
          context.system.shutdown
        }
    }
  }
  var system = ActorSystem("SimpleExample")
  var actor1 = system.actorOf(Props[CountDownActor], "Actor1")
  var actor2 = system.actorOf(Props[CountDownActor], "Actor2")

  actor1 ! StartCounting(10, actor2)

}
