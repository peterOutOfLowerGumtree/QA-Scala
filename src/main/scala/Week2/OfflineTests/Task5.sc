def bunnyEars(input: Int): Int = {
  if (input == 0) 0
  else if (input == 1) 2
  else {
    bunnyEars(input - 1) + 2 //ugh
  }
}

bunnyEars(0)
bunnyEars(1)
bunnyEars(2)
