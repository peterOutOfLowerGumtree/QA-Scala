def fibonacci(input: Long): Long = {
  // create loop which makes an ArrayBuffer with each new entry being the sum of the last two (first n terms)
  // look through the ArrayBuffer for the 'input'th entry and return that value
  if (input == 0) 0
  else if (input == 1) 1
  else fibonacci(input - 1) + fibonacci(input - 2)
}

for(i <- 0 to 15) println(fibonacci(i))

fibonacci(10)