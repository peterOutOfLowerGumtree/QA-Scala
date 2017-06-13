package Week2.Garage

import scala.collection.mutable.ArrayBuffer

class Garage {
  var personList = new ArrayBuffer[Person]()
  var vehicleList = new ArrayBuffer[Vehicle]()


  def spitPersonList(array: ArrayBuffer[Person]): Any = {
    for (p <- array.toArray) println(p)
  }

  def addEmployee(name: String, age: Int, contactNo: String, role: String, wage: Double): Unit = {
    personList +=  Person.per(EmployeeIDGenerator.next, name, age, contactNo, role, wage)
  }

  def addCustomer(name: String, age: Int, contactNo: String, contactAddress: String, postCode: String): Unit = {
    personList +=  Person.per(CustomerIDGenerator.next, name, age, contactNo, contactAddress, postCode)
  }

  def spitVehicleList(array: ArrayBuffer[Vehicle]): Any = {
    for (v <- array.toArray) println(v)
  }

  def addCar(brand: String, model: String, regNo: String): Unit = {
    vehicleList +=  Vehicle.veh(VehicleIDGenerator.next, brand, model, regNo)
  }

  def addBike(brand: String, typeOfBike: String): Unit = {
    vehicleList += Vehicle.veh(VehicleIDGenerator.next, brand, typeOfBike)
  }

  def removeVehicle[T](vehicleType: T): Unit = {
    vehicleType match {
      case vehicleType: Int =>
        vehicleList = vehicleList.filter(_.id != vehicleList)
      case "Car" =>
        vehicleList = vehicleList.filter(_.isInstanceOf[Vehicle.Car] == false)
      case "Bike" =>
        vehicleList = vehicleList.filter(_.isInstanceOf[Vehicle.Bike] == false)
      case _ => println("No vehicle of that type")
    }
  }

  def fixById(vehicleId: Int): Unit = {
    vehicleList.map(vehicle => {
      if (vehicle.id == vehicleId) {
        vehicle.isFixed = true
        vehicle
      }
    })
  }

  object VehicleIDGenerator {
    private val n= new java.util.concurrent.atomic.AtomicLong
    def next = n.getAndIncrement()
  }

  object EmployeeIDGenerator {
    private val n = new java.util.concurrent.atomic.AtomicLong

    def next = n.getAndIncrement()
  }

  object CustomerIDGenerator {
    private val n= new java.util.concurrent.atomic.AtomicLong
    def next = n.getAndIncrement()
  }

}
