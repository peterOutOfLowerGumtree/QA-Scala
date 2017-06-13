package Week2.Garage

object Runner {

  def main(args: Array[String]): Unit = {
    val garage = new Garage()

    // ID Generator is 0-indexed by nature
    // First ID will be '1' for all
    garage.EmployeeIDGenerator.next
    garage.CustomerIDGenerator.next
    garage.VehicleIDGenerator.next


    garage.addEmployee("John Smith", 25, "0800001066", "Cleaner", 9.87)
    garage.addCustomer("Peter Out", 65, "01009998760", "42 Wallaby Way, Sydney", "SYD NEY")


    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addCar("BMW", "X5", "R3GN UMB")
    garage.addCar("BM6", "X6", "R3GN UM6")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spar4", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spar4", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spar4", "Bicwetycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spark3435", "Bicycle")
    garage.addBike("Spark", "Bicycle")
    garage.addBike("Spark", "Bicycle")

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