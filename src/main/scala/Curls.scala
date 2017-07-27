object Curls extends App {

  def recursiveCurls(curlyBoys: Int): Unit = {
    val c = "{"
    if (curlyBoys == 0) {
      println(s"Alas, there are $curlyBoys curly boys...")
      Thread.sleep(500)
    }
    else if (curlyBoys == 1) {
      println(s"Wait! Now there is $curlyBoys curly boy! ${c}")
      Thread.sleep(500)
    }
    else {
      println(s"Now there are $curlyBoys curly boys! ${c * curlyBoys}")
      Thread.sleep(500)
    }
    recursiveCurls(curlyBoys + 1)
  }
  recursiveCurls(0)
}