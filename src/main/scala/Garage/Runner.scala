package Garage

import scala.collection.mutable.ArrayBuffer

object Runner {

  def main(args: Array[String]): Unit = {
    var personList = new ArrayBuffer[Person]()
    val per = new Person("John Smith", 25, "0800001066")
    personList += per
    spitPersonList(personList)
  }

  def spitPersonList(array:ArrayBuffer[Person]): Any = {
    for (p <- array.toArray) println(p)
  }
}

