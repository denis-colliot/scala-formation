package tp3.garage

/**
  * Created by zenika on 18/05/16.
  */
object Main extends App {

  // 3.2 Comparaison sémantique.

  val f1 = new Ferrari(3, "blue", 4)
  val f2 = new Ferrari(4, "red", 0)
  val f3 = new Ferrari(4, "red", 0)

  println(f1.eq(f2))      // false
  println(f1.ne(f2))      // true
  println(f1.equals(f2))  // false
  println(f2.equals(f3))  // true

  // 3.3 Trait.

  val vtt = new VTT() with Vehicule
  vtt.rouler()

}
