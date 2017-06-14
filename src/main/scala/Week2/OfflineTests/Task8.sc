def stringClean(input: String): String = {
  var output = input.charAt(0).toString
  for(i <- input) if(output.last != i) output += i
  output
}

stringClean("yyzzza")
stringClean("abbbcdd")
stringClean("Hello")