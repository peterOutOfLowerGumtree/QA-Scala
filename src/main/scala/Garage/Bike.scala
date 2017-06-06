package Garage

class Bike(brandc: String, modelc: String, regNoc: String, typeOfBikec: String, isFixedc: Boolean) extends Vehicle(brandc, modelc, regNoc, isFixedc) {
  val typeOfBike: String = typeOfBikec

  override def toString: String = s"Bike | Brand: $brand | Model: $model | Reg No: $regNo | Type of Bike: $typeOfBike | Fixed: $isFixed"
}
