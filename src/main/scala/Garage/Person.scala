package Garage

abstract class Person(namec: String, agec: Int, contactNoc: String) {
  private var _name: String = namec
  private var _age: Int = agec
  private var _contactNo: String = contactNoc

  def name = _name
  def age = _age
  def contactNo = _contactNo

  def name_=(value: String): Unit = _name = value
  def age_=(value: Int): Unit = _age = value
  def contactNo_=(value: String): Unit = _contactNo = value
}