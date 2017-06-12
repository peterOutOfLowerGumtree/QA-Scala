// 6: Strings
def returnStrings(word: String, num: Int): String = {
  word takeRight num
}
println(returnStrings("Hello", 3))

// 7: Strings 2
def returnStrings2(word1: String, word2: String, char1: Char, char2: Char): String = {
  lazy val concat = word1 + word2
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