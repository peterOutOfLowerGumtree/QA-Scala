// Fixed point of function f if f(x) = x
import math.abs

object exercise {
  val tolerance = 0.0001
  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance

  def fixedpoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }
}

exercise.fixedpoint(x => 1 + x/2)(1)

def sqrt(x: Int): Int = {
  x
}