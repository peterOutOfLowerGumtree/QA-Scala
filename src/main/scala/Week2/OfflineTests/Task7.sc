def endsLy(input: String): Boolean = {
  val lowerInput = input.toLowerCase
  if(lowerInput.length <2) false
  else if(lowerInput.charAt(lowerInput.length-2) == 'l' && lowerInput.charAt(lowerInput.length-1) == 'y') true
  else false
}

endsLy("oddly")
endsLy("y")
endsLy("oddy")