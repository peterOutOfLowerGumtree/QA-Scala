package Week2.Garage

abstract class Person {
  def name: String
  def age: Int
  def contactNo: String
}

object Person {

  private class Employee(employeeIDc: Long, namec: String, isBusyc: Boolean, agec: Int, contactNoc: String, rolec: String, wagec: Double) extends Person {
    val employeeID: Long = employeeIDc
    def name: String = namec
    var isBusy: Boolean = isBusyc
    def age: Int = agec
    def contactNo: String = contactNoc
    def role: String = rolec
    def wage: Double = wagec

    override def toString: String = s"Employee ID: $employeeID | Name: $name | Is Busy: $isBusy | Age: $age | Contact Number: $contactNo | Role: $role | Wage:£$wage per hour"
  }

  private class Customer(customerIDc: Long, namec: String, agec: Int, contactNoc: String, contactAddressc: String, postCodec: String) extends Person {
    val customerID: Long = customerIDc
    def name: String = namec
    def age: Int = agec
    def contactNo: String = contactNoc
    def contactAddress: String = contactAddressc
    def postCode: String = postCodec

    override def toString: String = s"Customer ID: $customerID | Name: $name | Age: $age | Contact Number: $contactNo | Contact Address: $contactAddress, $postCode"
  }

  def per(employeeIDc: Long, namec: String, isBusyc: Boolean, agec: Int, contactNoc: String, rolec: String, wagec: Double): Person = new Employee(employeeIDc: Long, namec: String, isBusyc: Boolean, agec: Int, contactNoc: String, rolec: String, wagec: Double)
  def per(customerIDc: Long, namec: String, agec: Int, contactNoc: String, contactAddressc: String, postCodec: String): Person = new Customer(customerIDc: Long, namec: String, agec: Int, contactNoc: String, contactAddressc: String, postCodec: String)
}