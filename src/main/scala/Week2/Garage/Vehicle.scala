package Week2.Garage

import scala.collection.mutable.ArrayBuffer

abstract class Vehicle {
  val id: Long
  def brand: String
  var costToFix: Int
  var isFixed: Boolean = false
}

object Vehicle {

  class Car(idc: Long, brandc: String, modelc: String, regNoc: String, costToFixc: Int) extends Vehicle {
    val id: Long = idc
    def brand: String = brandc
    def model: String = modelc
    def regNo: String = regNoc
    var costToFix: Int = costToFixc

    override def toString: String = s"ID: $id | Car | Brand: $brand  | Model: $model | Reg No: $regNo | Fixed: $isFixed | Cost to Fix: £$costToFix"
  }

  class Bike(idc: Long, brandc: String, typeOfBikec: String, costToFixc: Int) extends Vehicle {
    val id: Long = idc
    def brand: String = brandc
    def typeOfBike: String = typeOfBikec
    var costToFix: Int = costToFixc

    override def toString: String = s"ID: $id | Bike | Brand: $brand | Type of Bike: $typeOfBike | Fixed: $isFixed | Cost to Fix: £$costToFix"
  }

  // Overloading
  def veh(idc: Long, brandc: String, modelc: String, regNoc: String, costToFixc: Int): Vehicle = new Car(idc: Long, brandc: String, modelc: String, regNoc: String, costToFixc: Int)
  def veh(idc: Long, brandc: String, typeOfBikec: String, costToFixc: Int): Vehicle = new Bike(idc: Long, brandc: String, typeOfBikec: String, costToFixc: Int)
}