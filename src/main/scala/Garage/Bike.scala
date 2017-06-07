package Garage

class Bike(id: Int, brand: String, val typeOfBike: String, var isFixed2: Boolean) extends Vehicle(id, brand, isFixed2) {
  override def toString: String = s"ID: $id | Bike | Brand: $brand | Type of Bike: $typeOfBike | Fixed: $isFixed"
}
