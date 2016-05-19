/**
  * Created by zenika on 18/05/16.
  */
object Main extends App {

  val map = Map(1->"un", 2->"deux")
  println(map.getOrElse(1, "Default!"))
  println(map.getOrElse(6, "Default!"))

}
