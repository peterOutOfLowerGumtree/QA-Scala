package Week1.Garage

class Employee(var _employeeID: Int, name: String, age: Int, contactNo: String, var _role: String, var _wage: Double) extends Person(name, age, contactNo) {
  def employeeID = _employeeID
  def role = _role
  def wage = _wage

  def employeeID_=(value: Int): Unit = _employeeID = value
  def role_=(value: String): Unit = _role = value
  def wage_=(value: Double): Unit = _wage = value

  override def toString: String = s"Employee ID: $employeeID | Name: $name | Age: $age | Contact Number: $contactNo | Role: $role | Wage:£$wage per hour"
}
