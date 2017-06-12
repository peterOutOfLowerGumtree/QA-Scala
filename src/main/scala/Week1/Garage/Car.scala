package Week1.Garage

class Car(id: Int, brand: String, val model: String, val regNo: String, var isFixed2: Boolean) extends Vehicle(id, brand, isFixed2) {
  override def toString: String = s"ID: $id | Car | Brand: $brand  | Model: $model | Reg No: $regNo | Fixed: $isFixed"
}
