// 1: Hello World!
println("Hello World!")

// 2: Assignment
var helloWorld = "Hello World!"
println(helloWorld)

// 3: Parameters
def parameters: Unit = {
  println("Hello world!")
}
parameters

// 4: Return types
def returnString: String = {
  val string = "Hello World!"
  string
}
println(returnString)

// 5: Type Inference
def returnAny(a: Any) = {
  a
}
println(returnAny(4.4568745 + " Hi " + 3 + " " + true))

// 6: Strings
def returnStrings(word: String, num: Int): String = {
  word takeRight num
}
println(returnStrings("Hello", 3))

// 7: Strings 2
def returnStrings2(word1: String, word2: String, char1: Char, char2: Char): String = {
  val concat = word1 + word2
  concat.replace(char1, char2)
}
println(returnStrings2("Ha", "llo", 'a', 'e'))

// 8: Operators
def operators(num1: Int, num2: Int): Int = {
  num1 + num2
}
println(operators(3, 4))

// 9: Conditionals
def conditionals(num1: Int, num2: Int, ifTrue: Boolean): Int = {
  if (ifTrue == true) num1 + num2
  else num1 * num2
}
println(conditionals(3, 4, true))
println(conditionals(3, 4, false))

// 10: Conditionals 2
def conditionals2(num1: Int, num2: Int, ifTrue: Boolean): Int = {
  if (num1 == 0) num2
  else if (num2 == 0) num1
  else if (num1 == 0 && num2 == 0) 0
  else if (ifTrue == true) num1 + num2
  else num1 * num2
}
println(conditionals2(0, 4, true)) // Return num2
println(conditionals2(3, 0, true)) // Return num1
println(conditionals2(0, 0, true)) // Return 0
println(conditionals2(3, 4, true)) // Sum
println(conditionals2(3, 4, false)) // Multiply

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
def iteration3(word1: String, word2: String, num: Int): Unit = {
  for (i <- 1 to num) {
    if (i % 15 == 0) println(word1 + word2)
    else if (i % 3 == 0) println(word1)
    else if (i % 5 == 0) println(word2)
    else println(i)
  }
}
iteration3("Fizz", "Buzz", 15)

// 14: Iteration 4
def recursion(word: String, num: Int): Unit = {
  if (num == 1) println(word)
  else {
    recursion(word, num - 1)
    println(word)
  }
}
recursion("Hi", 5)

def recursion2(word: String, num1: Int, num2: Int): Unit = {
  if (num1 == 1) println(word * num2)
  else {
    recursion2(word, num1 - 1, num2)
    println(word * num2)
  }
}
recursion2("H", 4, 4)

def recursion3(word1: String, word2: String, num: Int): Unit = {
  if (num == 1) println(num)
  else {
    recursion3("Fizz", "Buzz", num - 1)
    if (num % 15 == 0) println(word1 + word2)
    else if (num % 3 == 0) println(word1)
    else if (num % 5 == 0) println(word2)
    else println(num)
  }
}
recursion3("Fizz", "Buzz", 15)

// 15: Pattern Matching 1
def patternMatching1a(num1: Int, num2: Int, ifTrue: Boolean): Int = ifTrue match {
  case true => num1 + num2
  case false => num1 * num2
}
println(patternMatching1a(3, 4, true))
println(patternMatching1a(3, 4, false))

def patternMatching1b(num1: Int, num2: Int, ifTrue: Boolean): Int = num1 match {
  case 0 => num2
  case _ => num2 match {
    case 0 => num1
    case _ => ifTrue match {
      case true => num1 + num2
      case false => num1 * num2
    }
  }
}
println(patternMatching1b(0, 4, true)) // Return num2
println(patternMatching1b(23, 0, true)) // Return num1
println(patternMatching1b(0, 0, true)) // Return 0
println(patternMatching1b(3, 4, true)) // Sum
println(patternMatching1b(3, 4, false)) // Multiply

// 16: Pattern Matching 2
def patternMatching2(any: Any): Any = any match {
  case Array(a,b) => (b,a)
  case List(a,b) => (b,a)
  case (a,b) => (b,a)
  case _ => "You're a fool"
}
println(patternMatching2(1,2,8))

// 17: Functional 1
var availableIDs = java.util.TimeZone.getAvailableIDs.map(line => line.split("/").last).filter(line => line.length() > 1).map(line => line.grouped(10))






















