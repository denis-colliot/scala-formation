package tp6

import org.scalatest.{FunSuite, Ignore}

/**
  * Created by zenika on 18/05/16.
  */
@Ignore
class BanqueTest extends FunSuite {

  val banque = new Banque

  test("Account #1 should be credited to 25") {
    val compte = new Compte

    banque.credit(compte, 15)
    assert(compte.solde == 15)

    banque.credit(compte, 10)
    assert(compte.solde == 25)
  }

  test("Account #1 initially set to 50 should be debited to 25") {
    val compte = new Compte(50, 1)

    banque.debit(compte, 15)
    assert(compte.solde == 35)

    banque.debit(compte, 10)
    assert(compte.solde == 25)
  }

  test("Percentage(100,50) should return 50") {
    assert(banque.percentage(100, 50) == 50)
  }

  test("Percentage(50, 50) should return 25") {
    assert(banque.percentage(50, 50) == 25)
  }

  test("Percentage(40, 25) should return 10") {
    assert(banque.percentage(40, 25) == 10)
  }

  // 6.2

  test("Percentage(100,50) should return 50") {
    // FIXME assert(banque.agios(new Compte(100, 1)) == 0.5)
  }

}
