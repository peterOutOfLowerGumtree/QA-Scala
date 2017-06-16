object Curls extends App {
  var curlyBoys = 0
  val c = "{"
  while (true) {
    var curlyBoyCount = ""
    if (curlyBoys == 0) {
      println(s"Alas, there are $curlyBoys curly boys...")
      Thread.sleep(500)
    }
    curlyBoys += 1
    if (curlyBoys == 1) {
      println(s"Wait! Now there is $curlyBoys curly boy! ${c * curlyBoys}")
      Thread.sleep(500)
    }
    else {
      println(s"Now there are $curlyBoys curly boys! ${c * curlyBoys}")
      Thread.sleep(500)
    }
  }
}