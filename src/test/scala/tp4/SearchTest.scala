package tp4

import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by zenika on 18/05/16.
  */
class SearchTest extends FunSuite {

  val searchService = new Search()

  // 4.2

  test("search(569) should not find a match") {
    assert(searchService.search(569) == "aucune correspondance trouvée")
  }

  test("search(0) should not find a match") {
    assert(searchService.search(0) == "aucune correspondance trouvée")
  }

  test("search(-16) should not find a match") {
    assert(searchService.search(-16) == "aucune correspondance trouvée")
  }

  test("search(1) should find a match with 'Louis'") {
    assert(searchService.search(1) == "La personne 'Louis' a bien été trouvée")
  }

  test("search(9) should find a match with 'Leo'") {
    assert(searchService.search(9) == "La personne 'Leo' a bien été trouvée")
  }

  test("search(19) should find a match with 'Jean'") {
    assert(searchService.search(19) == "La personne 'Jean' a bien été trouvée")
  }

  test("search(3) should find a match with 'Martin'") {
    assert(searchService.search(3) == "La personne 'Martin' a bien été trouvée")
  }

}
