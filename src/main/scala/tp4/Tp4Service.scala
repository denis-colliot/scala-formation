package tp4

object Annuaire {

  val annuaire: Map[Int, String] = Map(
    1 -> "Louis",
    2 -> "Paul",
    5 -> "Patrick",
    9 -> "Leo",
    4 -> "Cedric",
    3 -> "Martin",
    19 -> "Jean"
  )

}

/**
  * Created by zenika on 18/05/16.
  */
final class Tp4Service {

  //  def giveYourChoice(valeur: Int): String = {
  //    if (valeur == 1) "Tout est OK"
  //    else if (valeur == 2) "Attention à la marche"
  //    else if (valeur == 4) "Attention à la marche"
  //    else if (valeur == 10) "10 est un bon choix"
  //    else s"la valeur saisie ($valeur) n'est pas reconnue"
  //  }

  def giveYourChoice(valeur: Int): String = {
    valeur match {
      case 1 => "Tout est OK"
      case 2 | 4 => "Attention à la marche"
      case 10 => "10 est un bon choix"
      case _ => s"la valeur saisie ($valeur) n'est pas reconnue"
    }
  }

}
