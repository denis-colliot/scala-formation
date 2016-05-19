package tp3.banque

/**
  * Created by zenika on 18/05/16.
  */
object devise {

  class DeviseEuro(val montant: Double) {
    override def toString: String = s"$montant €"
  }

  class DeviseUSA(val montant: Double) {
    override def toString: String = s"$$ $montant"
  }

}
