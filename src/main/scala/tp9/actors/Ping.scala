package tp9.actors

import akka.actor.ActorRef
import tp9.pingpong.Msg._

/**
  * Created by zenika on 20/05/16.
  */
class Ping(val actorRef: ActorRef) extends AbstractActor {

  override def receive: Receive = {
    case InitMsg => {
      println("[Ping] Réception d'un 'InitMsg', renvoi d'un 'PingMsg'")
      actorRef ! PingMsg
    }
    case PongMsg => {
      println("[Ping] Réception d'un 'PongMsg', renvoi d'un 'PingMsg'")
      sender() ! PingMsg
    }
    case HaltMsg => {
      println("[Ping] Réception d'un 'HaltMsg', arrêt de l'acteur")
      context.stop(self)
    }
  }

}
