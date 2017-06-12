import scala.collection.mutable.ListBuffer

def calculator (input: String): Unit = {
  val array : Array[String] = input.split(", ")
  var numList : ListBuffer[Int] = ListBuffer()

  for(i<-0 until array.size) {
    numList += array(i).toInt
  }

  for(i<-0 until numList.size) {
    val num1 = numList(i%numList.size)
    val num2 = numList((i+1)%numList.size)
    val num3 = numList((i+2)%numList.size)

    calculations(num1,num2)
    calculations(num1,num3)
    calculations(num2,num1)
    calculations(num2,num3)
    calculations(num3,num1)
    calculations(num3,num2)
  }


}

def calculations (int1: Double, int2: Double): Any = {
  println(s"$int1 + $int2 = ${int1+int2}")
  println(s"$int1 - $int2 = ${int1-int2}")
  println(s"$int1 * $int2 = ${int1*int2}")
  if(int1%int2 == 0) println(s"$int1 / $int2 = ${int1/int2}")
  else println("NOT DIVISIBLE")
}


calculator("5, 3, 15")
calculator("4, 2, 8")
calculator("6, 2, 3")
calculator("9, 12, 108")
calculator("4, 16, 64")