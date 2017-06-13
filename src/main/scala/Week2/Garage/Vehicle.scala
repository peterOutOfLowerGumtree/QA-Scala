package Week2.Garage

abstract class Vehicle {
  val id: Long
  def brand: String

  var isFixed: Boolean = false
}

object Vehicle {
  class Car(idc: Long, brandc: String, modelc: String, regNoc: String) extends Vehicle {
    val id: Long = idc
    def brand: String = brandc
    def model: String = modelc
    def regNo: String = regNoc
    override def toString: String = s"ID: $id | Car | Brand: $brand  | Model: $model | Reg No: $regNo | Fixed: $isFixed"
  }

  class Bike(idc: Long, brandc: String, typeOfBikec: String)extends Vehicle {
    val id: Long = idc
    def brand: String = brandc
    def typeOfBike: String = typeOfBikec
    override def toString: String = s"ID: $id | Bike | Brand: $brand | Type of Bike: $typeOfBike | Fixed: $isFixed"
  }

  // Overloading
  def veh(idc: Long, brandc: String, modelc: String, regNoc: String): Vehicle = new Car(idc: Long, brandc: String, modelc: String, regNoc: String)
  def veh(idc: Long, brandc: String, typeOfBikec: String): Vehicle = new Bike(idc: Long, brandc: String, typeOfBikec: String)
}