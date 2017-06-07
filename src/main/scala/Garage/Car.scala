package Garage

class Car(brandc: String, modelc: String, regNoc: String, isFixedc: Boolean) extends Vehicle(brandc, isFixedc) {
  val model = modelc
  val regNo = regNoc

  override def toString: String = s"Car | Brand: $brand  | Model: $model | Reg No: $regNo | Fixed: $isFixed"
}
