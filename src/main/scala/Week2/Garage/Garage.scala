package Week2.Garage

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Garage {
  var personList = new ArrayBuffer[Person]()
  var vehicleList = new ArrayBuffer[Vehicle]()
  var garageIsOpen = false

  def toggleOpen(isOpen: Boolean): Unit = {
    if (isOpen) {
      garageIsOpen = true
      println("Garage is open!")
    }
    else {
      garageIsOpen = false
    }
  }

  def garageIsClosed = println("Garage is closed! Go away!")

  def spitPersonList(array: ArrayBuffer[Person]): Any = {
    if (garageIsOpen)
      for (p <- array.toArray) println(p)
    else garageIsClosed
  }

  def add(name: String, age: Int, contactNo: String, role: String, wage: Double): Unit = {
    if (garageIsOpen)
      personList += Person.per(EmployeeIDGenerator.next, name, false, age, contactNo, role, wage)
    else garageIsClosed
  }

  def add(name: String, age: Int, contactNo: String, contactAddress: String, postCode: String): Unit = {
    if (garageIsOpen)
      personList += Person.per(CustomerIDGenerator.next, name, age, contactNo, contactAddress, postCode)
    else garageIsClosed
  }

  def spitVehicleList(array: ArrayBuffer[Vehicle]): Any = {
    if (garageIsOpen)
      for (v <- array.toArray) println(v)
    else garageIsClosed
  }

  def add(brand: String, model: String, regNo: String): Unit = {
    if (garageIsOpen)
      vehicleList += Vehicle.veh(VehicleIDGenerator.next, brand, model, regNo, costToFix.cost * 10)
    else garageIsClosed
  }

  def add(brand: String, typeOfBike: String): Unit = {
    if (garageIsOpen)
      vehicleList += Vehicle.veh(VehicleIDGenerator.next, brand, typeOfBike, costToFix.cost * 3)
    else garageIsClosed
  }

  def removeVehicle[T](vehicleType: T): Unit = {
    if (garageIsOpen)
      vehicleType match {
        case "Car" =>
          vehicleList = vehicleList.filter(!_.isInstanceOf[Vehicle.Car])
        case "Bike" =>
          vehicleList = vehicleList.filter(!_.isInstanceOf[Vehicle.Bike])
        case _ =>
          vehicleList = vehicleList.filter(_.id != vehicleType)
      }
    else garageIsClosed
  }

  def fixById(vehicleId: Int): Unit = {
    if (garageIsOpen)
      vehicleList.map(vehicle => {
        if (vehicle.id == vehicleId) {
          vehicle.isFixed = true
          vehicle.costToFix = 0
          vehicle
        }
      })
    else garageIsClosed
  }

  def findVehicle(id: Long): Option[Vehicle] = {
    //if (garageIsOpen) {
      vehicleList.find(v => v.id == id)
   // }
    //else garageIsClosed
  }

  object VehicleIDGenerator {
    private val n = new java.util.concurrent.atomic.AtomicLong
    def next = n.getAndIncrement()
  }

  object EmployeeIDGenerator {
    private val n = new java.util.concurrent.atomic.AtomicLong
    def next = n.getAndIncrement()
  }

  object CustomerIDGenerator {
    private val n = new java.util.concurrent.atomic.AtomicLong
    def next = n.getAndIncrement()
  }

  object costToFix {
    private val c = new scala.util.Random
    def cost = c.nextInt(100)
  }

}