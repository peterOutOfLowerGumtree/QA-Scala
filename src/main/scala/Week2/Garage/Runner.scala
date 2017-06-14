package Week2.Garage

object Runner {

  def main(args: Array[String]): Unit = {
    val garage = new Garage

    // id Generator is 0-indexed by nature
    // First id will be '1' for all
    garage.EmployeeIDGenerator.next
    garage.CustomerIDGenerator.next
    garage.VehicleIDGenerator.next

    // Garage is closed by default
    garage.toggleOpen(true)
    println()

    garage.add("John Smith", 25, "0800001066", "Cleaner", 9.87)
    garage.add("Peter Out", 65, "01009998760", "42 Wallaby Way, Sydney", "SYD NEY")


    garage.add("BMW", "X5", "R3GN UMB")
    garage.add("BM6", "X6", "R3GN YM6")
    garage.add("BMW", "X5", "R4GN UMB")
    garage.add("BM6", "X6", "R3FN UM6")
    garage.add("BMW", "X5", "E3GN TMB")
    garage.add("BM6", "X6", "R3GN UN6")
    garage.add("Spark", "Bicycle")
    garage.add("Spar4", "Bickjle")
    garage.add("Sp3rk", "Bicicle")
    garage.add("Sdar4", "Btcycle")
    garage.add("Spavk", "Bicycle")
    garage.add("Spar4", "Betycle")


    garage.spitPersonList(garage.personList)
    println()
    garage.spitVehicleList(garage.vehicleList)

    println()

    garage.removeVehicle("Car")
    garage.removeVehicle(8)
    garage.fixById(9)
    garage.fixById(10)
    garage.fixById(11)

    println()

    garage.spitVehicleList(garage.vehicleList)

    println()

//    garage.toggleOpen(false)

    println(garage.findVehicle(12).get)
  }

}