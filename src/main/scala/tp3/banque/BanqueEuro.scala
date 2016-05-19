package tp3.banque

import tp3.banque.devise.DeviseEuro

/**
  * Created by zenika on 18/05/16.
  */
class BanqueEuro {

  def versement(devise: DeviseEuro): String = {
    s"La somme de ${devise} a été versée à la banque"
  }

}
