package tp3.banque

import tp3.banque.devise.{DeviseEuro, DeviseUSA}

/**
  * Created by zenika on 18/05/16.
  */
object Usa2Euro {

  // 1 U.S. dollar = 0.886784254 Euros
  implicit def usa2Euro(deviseUSA: DeviseUSA) = {
    println(s"Conversion de $deviseUSA en Euros...")
    new DeviseEuro(0.886784254 * deviseUSA.montant)
  }

}
