package Garage

import scala.collection.mutable.ArrayBuffer

object Runner {

  def main(args: Array[String]): Unit = {
    val garage = new Garage()

    val emp = new Employee(1, "John Smith", 25, "0800001066", "Cleaner", 9.87)
    val cus = new Customer(1, "Peter Out", 65, "01009998760", "42 Wallaby Way, Sydney", "SYD NEY")


    garage.personList += emp
    garage.personList += cus
    garage.addCar("BMW", "X5", "R3GN UMB", 4, 6)
    garage.addBike("Spark", "Bicycle")
    garage.spitPersonList(garage.personList)
    garage.spitVehicleList(garage.vehicleList)
  }

}