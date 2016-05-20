package tp9.actors

import akka.actor.Actor

/**
  * Created by zenika on 20/05/16.
  */
abstract class AbstractActor extends Actor {

  override def preStart() = {
    println(s"L'acteur ${getClass} est créé")
  }

  override def postStop() = {
    println(s"L'acteur ${getClass} est stoppé")
  }

}
