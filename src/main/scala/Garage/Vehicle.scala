package Garage

abstract class Vehicle(brandc: String, modelc: String, regNoc: String, isFixedc: Boolean) {
  val brand: String = brandc
  val model: String = modelc
  val regNo: String = regNoc
  private var _isFixed: Boolean = isFixedc

  def isFixed = _isFixed

  def isFixed_=(value: Boolean): Unit = _isFixed = value
}