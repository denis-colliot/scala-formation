package tp9.pingpong

/**
  * TP9 - Actors.
  */
object Msg {

  case class InitMsg() {}

  case class PingMsg() {}

  case class PongMsg() {}

  case class HaltMsg() {}

  case class UnknownMsg() {}

}
