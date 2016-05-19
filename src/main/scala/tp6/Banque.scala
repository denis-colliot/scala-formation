package tp6

/**
  * Created by zenika on 19/05/16.
  */
class Compte(var solde: Int, val formule: Int) {

  def this() = this(0, 1)

  def updateSolde(operation: (Int) => Int) = {
    solde = operation(solde)
  }

}

class Banque {

  // 6.1

  def debit(compte: Compte, montant: Int) = {
    compte.updateSolde((x: Int) => x - montant)
  }

  def credit(compte: Compte, montant: Int) = {
    compte.updateSolde((x: Int) => x + montant)
  }

  // 6.2

  def percentage(x: Int, taux: Double) = x * (taux / 100)

  private def interetFormule1(compte: Compte) = percentage(compte.solde, 0.75)

  private def interetFormule2(compte: Compte) = percentage(compte.solde, 0.10)

  private def agiosFormule1(compte: Compte) = percentage(compte.solde, 0.5)

  private def agiosFormule2(compte: Compte) = percentage(compte.solde, 0.2)

  def interet(compte: Compte): Double = {
    compte.formule match {
      case 1 => interetFormule1(compte)
      case 2 => interetFormule2(compte)
    }
  }

  def agios(compte: Compte): Double = {
    compte.formule match {
      case 1 => agiosFormule1(compte)
      case 2 => agiosFormule2(compte)
    }
  }

}
//
//object Main extends App {
//  val banque = new Banque
//  val compte = new Compte(100, 1)
//  println(banque.agios(compte))
//}