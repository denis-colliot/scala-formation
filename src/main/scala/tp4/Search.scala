package tp4

/**
  * Created by zenika on 18/05/16.
  */
final class Search {

  def search(id: Int): String = {
    Annuaire.annuaire
      .get(id)
      .map(name => s"La personne '$name' a bien été trouvée")
      .getOrElse("aucune correspondance trouvée")
  }

}
