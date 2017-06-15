object Curls extends App {
  var curlyBoys = 0
  while(true) {
    if(curlyBoys == 0) println(s"Alas, there are $curlyBoys curly boys...")
    curlyBoys += 1
    if(curlyBoys == 1) println(s"Wait! Now there is $curlyBoys curly boy!")
    else {
      println(s"Now there are $curlyBoys curly boys!")
      Thread.sleep(1000)
    }
  }
}