/**
  * Created by zenika on 18/05/16.
  */
object Main extends App {

  val map = Map(1 -> "un", 2 -> "deux")
  println(map.getOrElse(1, "Default!"))
  println(map.getOrElse(6, "Default!"))


  //  def f1(x: Int)(y: Int) = x + y
  def f1(x: Int) = (y: Int) => x + y

  println(f1(1)(3))

  //  def isClosure(x: Int) = (x < y)

}
