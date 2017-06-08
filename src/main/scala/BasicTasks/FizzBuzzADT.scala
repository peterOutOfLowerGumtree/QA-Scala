package BasicTasks

/**
  * Created by Administrator on 08/06/2017.
  */
sealed abstract class FizzBuzzADT(i: Int) {
  override def toString: String = i.toString
}

case class Fizz(i: Int) extends FizzBuzzADT(i) {
  override val toString: String = "Fizz"
}

case class Buzz(i: Int) extends FizzBuzzADT(i) {
  override val toString: String = "Buzz"
}

case class FizzBuzz(i: Int) extends FizzBuzzADT(i) {
  override val toString: String = "FizzBuzz"
}

case class JustInt(i: Int) extends FizzBuzzADT(i)

object FizzBuzzADT {
  def apply(i: Int): FizzBuzzADT = i match {
    case _ if i % 3 == 0 && i % 5 == 0 => FizzBuzz(i)
    case _ if i % 3 == 0 => Fizz(i)
    case _ if i % 5 == 0 => Buzz(i)
    case _ => JustInt(i)
  }
}

Stream (1 to 15: _*).map (FizzBuzzADT (_) ).foreach (println)
