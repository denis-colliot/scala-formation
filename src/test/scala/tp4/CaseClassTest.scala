package tp4

import org.scalatest.FunSuite

/**
  * Created by zenika on 18/05/16.
  */
class CaseClassTest extends FunSuite {

  val caseClass = new CaseClass()

  // 4.3 - isMajeur

  test("isMajeur(human) with 10 yo should return false") {
    assert(!caseClass.isMajeur(Humain("x", "y", 10)))
  }

  test("isMajeur(human) with 17 yo should return false") {
    assert(!caseClass.isMajeur(Humain("y", "x", 17)))
  }

  test("isMajeur(human) with 18 yo should return true") {
    assert(caseClass.isMajeur(Humain("a", "h", 18)))
  }

  test("isMajeur(human) with 19 yo should return true") {
    assert(caseClass.isMajeur(Humain("t", "g", 19)))
  }

  test("isMajeur(human) with 25 yo should return true") {
    assert(caseClass.isMajeur(Humain("y", "o", 25)))
  }

  // 4.3 - isDupontRelative

  test("isDupontRelative(human) with name 'dupond' should return false") {
    assert(!caseClass.isDupontRelative(Humain("dupond", "x", 10)))
  }

  test("isDupontRelative(human) with name 'gupont' should return false") {
    assert(!caseClass.isDupontRelative(Humain("gupont", "y", 15)))
  }

  test("isDupontRelative(human) with name 'dupon t' should return false") {
    assert(!caseClass.isDupontRelative(Humain("dupon t", "paul", 65)))
  }

  test("isDupontRelative(human) with name 'dupont' should return true") {
    assert(caseClass.isDupontRelative(Humain("dupont", "y", 15)))
  }

  test("isDupontRelative(human) with name 'DuponT' should return true") {
    assert(caseClass.isDupontRelative(Humain("DuponT", "jean", 25)))
  }

  test("isDupontRelative(human) with name 'DUPONT' should return true") {
    assert(caseClass.isDupontRelative(Humain("DUPONT", "jean", 25)))
  }

}
