package tp2

import org.scalatest.FunSuite

/**
  * Created by zenika on 18/05/16.
  */
class Tp2Test extends FunSuite {

  test("Tuple with Boolean true should return 'OK'") {
    assert(Tp2.isThirdTrue(("", 1, true, 15.0)) == "OK")
  }

  test("Tuple with Boolean false should return 'KO'") {
    assert(Tp2.isThirdTrue(("", 1, false, 15.0)) == "KO")
  }

}
