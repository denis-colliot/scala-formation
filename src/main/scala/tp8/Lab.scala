package tp8

import scala.collection.immutable.Seq
import scala.xml.XML


object Lab extends App {

  /**
    * load XML file
    *
    * @return
    */
  def getXmlContent() = XML.load(getClass.getResourceAsStream("/tp8/data.xml"))

  def getAllTitles(): Seq[String] = {
    val xml = getXmlContent()
    (xml \\ "title")
      .map(title => title.text)
  }


  def getAllFantasyBooks() = {
    val xml = getXmlContent()
    (xml \ "book")
      .filter(book => (book \ "genre").text == "Fantasy")
      .map(book => book \ "@id")
      .map(nodeId => nodeId.text)
  }

  def getBookTitleById(id: String) = {
    val xml = getXmlContent()
    (xml \ "book")
      .filter(book => (book \ "@id").text == id)
      .map(bookNode => bookNode \ "title")
      .map(titleNode => titleNode.text)
  }

  def getNumberOfBookForOBrien() = {
    val xml = getXmlContent()
    (xml \ "book")
      .filter(book => (book \ "author").text.contains("O'Brien"))
      .count(_ => true)
  }

  def getNumberOfBookWithdescriptionContainWord(word: String) = {
    val xml = getXmlContent()
    (xml \ "book")
      .filter(book => (book \ "description").text.contains(word))
      .count(_ => true)
  }

}
