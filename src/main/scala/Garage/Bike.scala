package Garage

class Bike(brandc: String, typeOfBikec: String, isFixedc: Boolean) extends Vehicle(brandc, isFixedc) {
  val typeOfBike: String = typeOfBikec

  override def toString: String = s"Bike | Brand: $brand | Type of Bike: $typeOfBike | Fixed: $isFixed"
}
