package Garage

class Person (namec:String, agec:Int, contactNoc:String) {
  val name:String = namec
  val age:Int = agec
  val contactNo:String = contactNoc

  override def toString: String = "Name: "+this.name+"; Age: "+this.age+"; Contact Number: "+this.contactNo
}