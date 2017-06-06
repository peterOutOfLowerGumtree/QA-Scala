package Garage

class Employee(employeeIDc: Int, namec: String, agec: Int, contactNoc: String, rolec: String, wagec: Double) extends Person(namec, agec, contactNoc) {
  private var _employeeID: Int = employeeIDc
  private var _role: String = rolec
  private var _wage: Double = wagec

  def employeeID = _employeeID
  def role = _role
  def wage = _wage

  def employeeID_=(value: Int): Unit = _employeeID = value
  def role_=(value: String): Unit = _role = value
  def wage_=(value: Double): Unit = _wage = value

  override def toString: String = s"Employee ID: $employeeID | Name: $name | Age: $age | Contact Number: $contactNo | Role: $role | Wage:£$wage per hour"
}
