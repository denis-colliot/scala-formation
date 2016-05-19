package tp5

import org.scalatest.FunSuite

/**
  * Created by zenika on 18/05/16.
  */
class FactorielleTest extends FunSuite {

  val factorielle = new Factorielle

  // 5 - Récursivité

  test("fact(0) should return 1") {
    assert(factorielle.factRecNoTerm(0) == 1)
    assert(factorielle.factRecTerm(0) == 1)
  }

  test("fact(1) should return 1") {
    assert(factorielle.factRecNoTerm(1) == 1)
    assert(factorielle.factRecTerm(1) == 1)
  }

  test("fact(4) should return 24") {
    assert(factorielle.factRecNoTerm(4) == 24)
    assert(factorielle.factRecTerm(4) == 24)
  }

  test("fact(20) should return 2432902008176640000") {
    assert(factorielle.factRecNoTerm(20) == 2432902008176640000L)
    assert(factorielle.factRecTerm(20) == 2432902008176640000L)
  }

}
