package tp9.actors

import tp9.pingpong.Msg.{HaltMsg, PingMsg, PongMsg}

/**
  * Created by zenika on 20/05/16.
  */
class Pong extends AbstractActor {

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
  }

}
