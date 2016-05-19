package tp1

import org.scalatest.FunSuite
import org.specs2.Specification

/**
  * Created by zenika on 18/05/16.
  */

class SetSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }

}

class HelloWorldSpec extends Specification {
  def is = s2"""

  This is a specification for the 'Hello World' string

  The 'Hello World' string should
    contain 11 characters           $e1
    start with 'Hello'              $e2
    end with 'world'                $e3
                                    """

  def e1 = "Hello world" must haveSize(11)

  def e2 = "Hello world" must startWith("Hello")

  def e3 = "Hello world" must endWith("world")
}

