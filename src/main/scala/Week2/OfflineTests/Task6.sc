def nTwice(input:String, num:Int): Unit = {
  print(s"${input.substring(0,num)}${input.substring(input.length-num,input.length)} ")
}

nTwice("Hello",2)
nTwice("Chocolate",3)
nTwice("Chocolate",1)