package Garage

import scala.collection.mutable.ArrayBuffer

object Runner {

  def main(args: Array[String]): Unit = {
    var personList = new ArrayBuffer[Person]()
    var vehicleList = new ArrayBuffer[Vehicle]()
    val emp = new Employee(1, "John Smith", 25, "0800001066", "Cleaner", 9.87)
    val cus = new Customer(1, "Peter Out", 65, "01009998760", "42 Wallaby Way, Sydney", "SYD NEY")
    val car = new Car("BMW", "X5", "4BCD 3FG", 4, 6, false)
    val bik = new Bike("Spark", "", "", "Bicycle", true)

    personList += emp
    personList += cus
    vehicleList += car
    vehicleList += bik
    spitPersonList(personList)
    spitVehicleList(vehicleList)
    println()

    emp.employeeID = 0
    emp.role = "Unemployed"
    emp.wage = 0
    spitPersonList(personList)
    spitVehicleList(vehicleList)
  }

  def spitPersonList(array: ArrayBuffer[Person]): Any = {
    for (p <- array.toArray) println(p)
  }

  def spitVehicleList(array: ArrayBuffer[Vehicle]): Any = {
    for (v <- array.toArray) println(v)
  }
}