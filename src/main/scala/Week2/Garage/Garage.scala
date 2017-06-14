package Week2.Garage

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class Garage {
      var personList = new ArrayBuffer[Person]()
      var vehicleList = new ArrayBuffer[Vehicle]()


      def spitPersonList(array: ArrayBuffer[Person]): Any = {
        for (p <- array.toArray) println(p)
      }

      def add(name: String, age: Int, contactNo: String, role: String, wage: Double): Unit = {
        personList += Person.per(EmployeeIDGenerator.next, name, age, contactNo, role, wage)
      }

      def add(name: String, age: Int, contactNo: String, contactAddress: String, postCode: String): Unit = {
        personList += Person.per(CustomerIDGenerator.next, name, age, contactNo, contactAddress, postCode)
      }

      def spitVehicleList(array: ArrayBuffer[Vehicle]): Any = {
        for (v <- array.toArray) println(v)
      }

      def add(brand: String, model: String, regNo: String): Unit = {
        vehicleList += Vehicle.veh(VehicleIDGenerator.next, brand, model, regNo, costToFix.cost*10)
      }

      def add(brand: String, typeOfBike: String): Unit = {
        vehicleList += Vehicle.veh(VehicleIDGenerator.next, brand, typeOfBike, costToFix.cost*3)
      }

      def removeVehicle[T](vehicleType: T): Unit = {
        vehicleType match {
          case "Car" =>
            vehicleList = vehicleList.filter(!_.isInstanceOf[Vehicle.Car])
          case "Bike" =>
            vehicleList = vehicleList.filter(!_.isInstanceOf[Vehicle.Bike])
          case _ =>
            vehicleList = vehicleList.filter(_.id != vehicleType)
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