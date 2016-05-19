package tp4

import org.scalatest.FunSuite

/**
  * Created by zenika on 18/05/16.
  */
class Tp4ServiceTest extends FunSuite {

  val tp4Service = new Tp4Service

  test("giveYourChoice(1) should return 'Tout est OK'") {
    assert(tp4Service.giveYourChoice(1) == "Tout est OK")
  }

  test("giveYourChoice(2) should return 'Attention à la marche'") {
    assert(tp4Service.giveYourChoice(2) == "Attention à la marche")
  }

  test("giveYourChoice(4) should return 'Attention à la marche'") {
    assert(tp4Service.giveYourChoice(4) == "Attention à la marche")
  }

  test("giveYourChoice(10) should return '10 est un bon choix'") {
    assert(tp4Service.giveYourChoice(10) == "10 est un bon choix")
  }

  test("giveYourChoice(x) where x is not in {1,2,4,10} should return 'la valeur saisie (x) n'est pas reconnue'") {
    assert(tp4Service.giveYourChoice(0) == "la valeur saisie (0) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(3) == "la valeur saisie (3) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(5) == "la valeur saisie (5) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(6) == "la valeur saisie (6) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(7) == "la valeur saisie (7) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(8) == "la valeur saisie (8) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(9) == "la valeur saisie (9) n'est pas reconnue")
    assert(tp4Service.giveYourChoice(11) == "la valeur saisie (11) n'est pas reconnue")
  }


}
