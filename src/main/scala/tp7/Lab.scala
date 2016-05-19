package tp7

import tp7.CollectionRepository.{Eleve, Person}


object Lab extends App {

  def wordCount(s: String): Int = {
    s.split(' ').length
  }

  def avg(l: List[Double]): Double = l.sum / l.size

  def moyenneGenerale(l: List[List[Double]]): Double = {
    avg(l.map(avg))
  }

  def groupWord(text: String): (List[String], List[String]) = {
    text
      .split(' ')
      .toList
      .partition(word => word.length > 4)
  }

  // exercice 7.4
  def personMoreThan30years(l: List[Person]): List[Person] = {
    l.filter(p => p.age > 30)
  }

  def personMeanAge(l: List[Person]): Double = {
    l.map(p => p.age).sum.toDouble / l.size
  }

  def cities(l: List[Person]): Set[String] = {
    l.map(p => p.ville).toSet
  }

  def formatPerson(l: List[Person]): List[String] = {
    l.map(p => s"${p.nom}-${p.ville}")
  }

  def sortPersonByAge(l: List[Person]): List[Person] = {
    l.sortBy(p => p.age)
  }

  //fin exercice 7.4

  def sum(l: List[String]): Int = {
    var sum = 0
    l.map(s => s.toInt).foreach(i => sum += i)
    sum
  }

  def firstONe(l: List[String]): String = l.head

  def others(l: List[String]): List[String] = l.tail

  def attributionNoteEleve(l: List[List[Double]], eleves: List[Eleve]): List[(Eleve, List[Double])] = {
    eleves
      .zipWithIndex
      .map { case (e, i) => (e, l(i)) }
  }

}
