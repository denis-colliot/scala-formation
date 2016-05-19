package tp3.banque

import tp3.banque.devise._

/**
  * Created by zenika on 18/05/16.
  */
object Main extends App {

  // 3.4

  import tp3.banque.Usa2Euro._

  val banqueEuro = new BanqueEuro

  val deviseEuro = new DeviseEuro(15)
  val deviseUSA = new DeviseUSA(10)

  println(s"Devise Euro : $deviseEuro")
  println(s"Devise USA : $deviseUSA")

  println(banqueEuro.versement(deviseEuro))
  println(banqueEuro.versement(deviseUSA))

}
