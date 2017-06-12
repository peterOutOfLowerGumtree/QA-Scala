package Week1.Garage

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

  def addCar(id: Int, brand: String, make: String, regNo: String): Unit = {
    vehicleList += new Car(id, brand, make, regNo, false)
  }

  def addBike(id: Int, brand: String, typeOfBike: String): Unit = {
    vehicleList += new Bike(id, brand, typeOfBike, false)
  }

  def removeVehicle[T](vehicleType: T): Unit = {
    vehicleType match {
      case vehicleType: Int =>
        vehicleList = vehicleList.filter(_.id != vehicleType)
      case "Car" =>
        vehicleList = vehicleList.filter(_.isInstanceOf[Car] == false)
      case "Bike" =>
        vehicleList = vehicleList.filter(_.isInstanceOf[Bike] == false)
      case _ => println("No vehicle of that type")
    }
  }

  def fixById(vehicleId: Int): Unit = {
    vehicleList.map(vehicle => {
      if (vehicle.getId == vehicleId) {
        vehicle.isFixed = true
        vehicle
      }
    })
  }

}
