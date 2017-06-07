package Garage

abstract class Vehicle(val id: Int, val brand: String, var _isFixed: Boolean) {
  def isFixed = _isFixed

  def getId = id

  def isFixed_=(value: Boolean): Unit = _isFixed = value
}