package tp9.actors

import akka.actor.Actor
import tp9.pingpong.Msg.{HaltMsg, InitMsg, PingMsg, PongMsg}

/**
  * Created by zenika on 20/05/16.
  */
class Unknown extends Actor {

  override def receive: Receive = {
    case _ => println("Message inconnu")
  }

}
