package Garage

import scala.collection.mutable.ArrayBuffer

class Garage {
  var personList = new ArrayBuffer[Person]()
  var vehicleList = new ArrayBuffer[Vehicle]()


  def spitPersonList(array: ArrayBuffer[Person]): Any = {
    for (p <- array.toArray) println(p)
  }
  def spitVehicleList(array: ArrayBuffer[Vehicle]): Any = {
    for (v <- array.toArray) println(v)
  }

  def addCar(brand: String, make: String, regNo: String, numberOfDoors: Int, numberOfGears: Int): Unit = {
    vehicleList += new Car(brand, make, regNo, numberOfDoors, numberOfGears, false)
  }
  def addBike(brand: String, make: String, regNo: String, typeOfBike: String): Unit = {
    vehicleList += new Bike(brand, make, regNo, typeOfBike, false)
  }

  def removeByType(vehicleType: String): Unit = {
    vehicleList
  }
}
