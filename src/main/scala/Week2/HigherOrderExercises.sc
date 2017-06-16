// Tail-recursive sum
object tailRec {
  def sumRec(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
  }
}

tailRec.sumRec(x => x + x)(3, 5)

// Currying
object currying {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)

    sumF
  }

  def sumInts = sum(x => x) // x => x is an anonymous function
  def sumCubes = sum(x => x * x * x)

  def sumFactorials = sum(fact)

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)
}

import currying.sumInts
import currying.sumCubes
import currying.sumFactorials

sumInts(3, 4)
sumCubes(3, 4)
sumFactorials(3, 4)
sumCubes(1, 10) + sumFactorials(10, 20)

object Product {
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)

  def fact(n: Int) = product(x => x)(1,n)
}

Product.product(x => x * x)(3,4)
Product.fact(5)

object Product1 {
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

  def product(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int) = product(x => x)(1, n)


}

import Product1.product

product(x => x * x)(3, 4)
Product1.fact(5)