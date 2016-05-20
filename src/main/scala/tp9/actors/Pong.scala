package tp9.actors

import akka.actor.Actor
import tp9.pingpong.Msg.{HaltMsg, PingMsg, PongMsg, UnknownMsg}

/**
  * Created by zenika on 20/05/16.
  */
class Pong extends Actor {

  var compteur: Int = 0

  override def receive: Receive = {
    case PingMsg => {
      println(s"[Pong] Réception d'un 'PingMsg', incrémentation du compteur ($compteur)")
      compteur += 1
      if (compteur < 3) {
        println(s"[Pong] Envoi d'un 'PongMsg'")
        sender() ! PongMsg
      } else {
        println(s"[Pong] Envoi d'un 'HaltMsg'")
        sender() ! HaltMsg
      }
    }
    case _ => sender() ! UnknownMsg
  }

}
