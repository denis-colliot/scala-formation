package tp9

import akka.actor.{ActorSystem, Props}
import tp9.actors.{Ping, Pong}
import tp9.pingpong.Msg.InitMsg

/**
  * Created by zenika on 20/05/16.
  */
object Main extends App {

  val system = ActorSystem("PingPongSystem")

  val pongActor = system.actorOf(Props[Pong])
  val pingActor = system.actorOf(Props[Ping])

  pingActor ! InitMsg

}
