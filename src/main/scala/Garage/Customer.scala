package Garage

class Customer(customerIDc: Int, namec: String, agec: Int, contactNoc: String, contactAddressc: String, postCodec: String) extends Person(namec, agec, contactNoc) {
  private var _customerID: Int = customerIDc
  private var _contactAddress: String = contactAddressc
  private var _postCode: String = postCodec

  def customerID = _customerID
  def contactAddress = _contactAddress
  def postCode = _postCode

  def customerID_=(value: Int): Unit = _customerID = value
  def contactAddress_=(value: String): Unit = _contactAddress = value
  def postCode_=(value: String): Unit = _postCode = value

  override def toString: String = s"Customer ID: $customerID | Name: $name | Age: $age | Contact Number: $contactNo | Contact Address: $contactAddress, $postCode"
}
