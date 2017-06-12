package Week1.Garage

abstract class Person(var _name: String, var _age: Int, var _contactNo: String) {
  def name = _name
  def age = _age
  def contactNo = _contactNo

  def name_=(value: String): Unit = _name = value
  def age_=(value: Int): Unit = _age = value
  def contactNo_=(value: String): Unit = _contactNo = value
}