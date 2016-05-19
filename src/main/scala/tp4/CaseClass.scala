package tp4

/**
  * Created by zenika on 19/05/16.
  */
final class CaseClass {

  def isMajeur(humain: Humain): Boolean = {
    humain match {
      case Humain(_, _, age) => age >= 18
      case _ => false
    }
  }

  def isDupontRelative(humain: Humain): Boolean = {
    humain match {
      case Humain(nom, _, _) => nom matches "(?i)dupont"
      case _ => false
    }
  }

}

case class Humain(nom: String, prenom: String, age: Int) {

}