package Week1.Garage

class Customer(var _customerID: Int, name: String, age: Int, contactNo: String, var _contactAddress: String, var _postCode: String) extends Person(name, age, contactNo) {
  def customerID = _customerID
  def contactAddress = _contactAddress
  def postCode = _postCode

  def customerID_=(value: Int): Unit = _customerID = value
  def contactAddress_=(value: String): Unit = _contactAddress = value
  def postCode_=(value: String): Unit = _postCode = value

  override def toString: String = s"Customer ID: $customerID | Name: $name | Age: $age | Contact Number: $contactNo | Contact Address: $contactAddress, $postCode"
}
