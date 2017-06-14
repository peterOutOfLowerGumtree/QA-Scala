def doubleChar(input: String): Unit = {
  input.split("").foreach(p => print(p*2))
}

doubleChar("The")
doubleChar("AAbb")
doubleChar("Hi-There")