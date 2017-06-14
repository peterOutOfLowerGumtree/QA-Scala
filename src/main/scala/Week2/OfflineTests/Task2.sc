def getSandwich(input: String): String = {
  val beginLetter = input.indexOf('d')
  val endLetter = input.lastIndexOf('b')
  input.substring(beginLetter+1,endLetter)
}

getSandwich("breadjambread")
getSandwich("xxbreadjambreadxx")
getSandwich("xxbreadxx")