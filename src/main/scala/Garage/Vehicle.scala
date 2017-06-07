package Garage

abstract class Vehicle(brandc: String, isFixedc: Boolean) {
  val brand: String = brandc
  private var _isFixed: Boolean = isFixedc

  def isFixed = _isFixed

  def isFixed_=(value: Boolean): Unit = _isFixed = value
}