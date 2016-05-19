package tp2

/**
  * Created by zenika on 18/05/16.
  */
object Tp2 {

  def isThirdTrue(t:(String, Int, Boolean, Double)):String = {
    if (t._3) {
      return "OK"
    }
    else {
      return "KO"
    }
  }

}
