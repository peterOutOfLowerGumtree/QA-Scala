object Logic {
  def and(x: Boolean, y: => Boolean) = if (x) y else false
  def or(x: Boolean, y: => Boolean) = if (x) true else y
}
Logic.and(true, false)
Logic.and(false, true)
Logic.and(true, true)

Logic.or(true, false)
Logic.or(false, true)
Logic.or(true, true)
Logic.or(false, false)

object NewtonSqrt {
  def abs(x: Double) = if (x < 0) -x else x
  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }
}

// Instead of needing to type "NewtonSqrt.sqrt(...)" each time, import the object
import NewtonSqrt.sqrt

import scala.annotation.tailrec
sqrt(2)
sqrt(4)
sqrt(0.001)
sqrt(1e-6)
sqrt(1e-20)
sqrt(1e20)
sqrt(1e50)

val x = 0
def f(y: Int) = y + 1
val result = {
  val x = f(3)
  x * x
} + x // inner x and outer x are separate. inner = 16; outer = 0

// Two ways of spanning multiple lines:
def timesByTwo (x: Int, y: Int) = {
  print((x
  + x) + " ") // Parentheses

  print(y + // Operator before line break
  y + " ")
}
timesByTwo(2,2)

// Greatest Common Divisor
def gcd(a: Int, b: Int): Int =
  if(b == 0) a else gcd(b, a % b) // Euclid's Algorithm
gcd(6,15)

// Factorial
def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n - 1)
factorial(4)


def tailrecFactorial(n: Int): Int = {
  def rec(n: Int, acc: Int): Int =
    if (n == 0) acc else rec(n - 1, n * acc)
  rec(n, 1)
}
tailrecFactorial(4)