package Week1.Garage

object Runner {

  def main(args: Array[String]): Unit = {
    val garage = new Garage()

    lazy val emp = new Employee(1, "John Smith", 25, "0800001066", "Cleaner", 9.87)
    lazy val cus = new Customer(1, "Peter Out", 65, "01009998760", "42 Wallaby Way, Sydney", "SYD NEY")

    garage.personList += emp
    garage.personList += cus

    garage.addCar(1, "BMW", "X5", "R3GN UMB")
    garage.addCar(2, "BM6", "X6", "R3GN UM6")
    garage.addCar(3, "BMW", "X5", "R3GN UMB")
    garage.addCar(4, "BM6", "X6", "R3GN UM6")
    garage.addCar(5, "BMW", "X5", "R3GN UMB")
    garage.addCar(6, "BM6", "X6", "R3GN UM6")
    garage.addCar(7, "BMW", "X5", "R3GN UMB")
    garage.addCar(8, "BM6", "X6", "R3GN UM6")
    garage.addCar(9, "BMW", "X5", "R3GN UMB")
    garage.addCar(10, "BM6", "X6", "R3GN UM6")
    garage.addCar(11, "BMW", "X5", "R3GN UMB")
    garage.addCar(12, "BM6", "X6", "R3GN UM6")
    garage.addCar(13, "BMW", "X5", "R3GN UMB")
    garage.addCar(14, "BM6", "X6", "R3GN UM6")
    garage.addCar(15, "BMW", "X5", "R3GN UMB")
    garage.addCar(16, "BM6", "X6", "R3GN UM6")
    garage.addCar(17, "BMW", "X5", "R3GN UMB")
    garage.addCar(18, "BM6", "X6", "R3GN UM6")
    garage.addCar(19, "BMW", "X5", "R3GN UMB")
    garage.addCar(20, "BM6", "X6", "R3GN UM6")
    garage.addCar(21, "BMW", "X5", "R3GN UMB")
    garage.addCar(22, "BM6", "X6", "R3GN UM6")
    garage.addBike(23, "Spark", "Bicycle")
    garage.addBike(24, "Spar4", "Bicycle")
    garage.addBike(25, "Spark", "Bicycle")
    garage.addBike(26, "Spar4", "Bicycle")
    garage.addBike(27, "Spark", "Bicycle")
    garage.addBike(28, "Spar4", "Bicwetycle")
    garage.addBike(29, "Spark", "Bicycle")
    garage.addBike(30, "Spark", "Bicycle")
    garage.addBike(31, "Spark", "Bicycle")
    garage.addBike(32, "Spark", "Bicycle")
    garage.addBike(33, "Spark3435", "Bicycle")
    garage.addBike(34, "Spark", "Bicycle")
    garage.addBike(35, "Spark", "Bicycle")

    garage.spitPersonList(garage.personList)
    garage.spitVehicleList(garage.vehicleList)

    println()

    garage.removeVehicle("Car")
    garage.removeVehicle(34)
    garage.fixById(25)
    garage.fixById(26)
    garage.fixById(27)

    println()

    garage.spitVehicleList(garage.vehicleList)
  }

}