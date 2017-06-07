package Garage

class Car(brandc: String, modelc: String, regNoc: String, numberOfDoorsc: Int, numberOfGearsc: Int, isFixedc: Boolean) extends Vehicle(brandc, isFixedc) {
  val model = modelc
  val regNo = regNoc
  val numberOfDoors = numberOfDoorsc
  val numberOfGears = numberOfGearsc

  override def toString: String = s"Car | Brand: $brand  | Model: $model | Reg No: $regNo | Number of Doors: $numberOfDoors | Number of Gears: $numberOfGears | Fixed: $isFixed"
}
