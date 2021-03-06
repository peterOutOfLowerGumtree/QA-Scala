package Week2.GroupTasks

import java.util.Scanner

object Guess {
  def main(args: Array[String]) {
    var randNum: Int = 0

    def generateNum() {
      randNum = 1 + scala.util.Random.nextInt(60)
    }
    generateNum()

    val sc = new Scanner(System.in)
    println("Enter guess:")
    var input = sc.next.toInt

    def findNum() {
      if (input != randNum) {
        case _ if Math.abs(randNum-input) < 2 => println("Boiling! Enter guess:")
        case _ if Math.abs(randNum-input) < 5 => println("Super warm! Enter guess:")
        case _ if Math.abs(randNum-input) < 10 => println("Super cold! Enter guess:")
        case _ => println("Freezing! Enter guess:")
        input = sc.next.toInt
        findNum()
      }
      else {
        println(s"found it! generated number is $randNum")
        generateNum()
        input = sc.next.toInt
        findNum()
      }
    }
    findNum()
  }
}
