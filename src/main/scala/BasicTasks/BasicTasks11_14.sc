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