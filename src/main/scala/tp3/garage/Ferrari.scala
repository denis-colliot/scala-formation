package tp3.garage

/**
  * Created by zenika on 18/05/16.
  */
class Ferrari(val nbPortes: Int, val couleur: String, var nbPassager: Int) extends Vehicule {

  /**
    * Second constructeur.
    *
    * @param couleur
    */
  def this(couleur: String) {
    this(2, couleur, 2)
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Ferrari]

  override def equals(other: Any): Boolean = other match {
    case that: Ferrari =>
      (that canEqual this) &&
        nbPortes == that.nbPortes &&
        couleur == that.couleur
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(nbPortes, couleur)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

}
