package tp5

import scala.annotation.tailrec

/**
  * Created by zenika on 18/05/16.
  */
final class Factorielle {

  def factRecNoTerm(nombre: Long): Long = {
    nombre match {
      case 0 => 1
      case _ => nombre * factRecNoTerm(nombre - 1)
    }
  }

  def factRecTerm(nombre: Long) = {
    @tailrec
    def factRecTerm_rec(nombre: Long, x: Long): Long = {
      if (nombre <= 1) x
      else factRecTerm_rec(nombre - 1, nombre * x)
    }
    factRecTerm_rec(nombre, 1)
  }

  def fib(n: Int) = {
    @tailrec
    def fib_tr(n: Int, a: Int, b: Int): Int =
      n match {
        case 0 => a
        case _ => fib_tr(n - 1, a + b, b)
      }
    fib_tr(n, 1, 0)
  }


}
