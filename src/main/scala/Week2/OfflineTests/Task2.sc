def getSandwich(input: String): String = {
  val beginLetter = input.indexOf('d')
  val endLetter = input.lastIndexOf('b')
  try {
    input.substring(beginLetter + 1, endLetter)
  } catch {case e: Exception => ""}
}

getSandwich("breadjambread")
getSandwich("xxbreadjambreadxx")
getSandwich("xxbreadxx")