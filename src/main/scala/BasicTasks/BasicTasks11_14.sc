// 11: Iteration
def iteration(word: String, num: Int): Unit = {
  for (i <- 1 to num) println(word)
}
iteration("Hi", 3)

// 12: Iteration 2
def iteration2(word: String, num: Int): Unit = {
  for (i <- 1 to num) println(word * num)
}
iteration2("H", 4)

// 13: Iteration 3

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

Stream(1 to 15: _*).map(FizzBuzzADT(_)).foreach(println)


// 14: Iteration 4
def recursion(word: String, num: Int): Unit = num match {
  case 1 => println(word)
  case _ =>
    recursion(word, num - 1)
    println(word)
}
recursion("Hi", 5)

def recursion2(word: String, height: Int, width: Int): Unit = {
  width match {
    case 0 => println("ERROR")
    case _ => height match {
      case 0 => println("ERROR")
      case 1 => println(word * width)
      case _ =>
        recursion2(word, height - 1, width)
        println(word * width)
    }
  }

}
recursion2("DINGUS", 4, 4)

def recursion3(num: Int): Unit = num match {
  case 1 => println(num)
  case _ =>
    recursion3(num - 1)
    num match {
      case _ if num % 15 == 0 =>  println("FizzBuzz")
      case _ if num % 3 == 0 => println("Fizz")
      case _ if num % 5 == 0 => println("Buzz")
      case _ => println(num)
    }
}
recursion3(15)