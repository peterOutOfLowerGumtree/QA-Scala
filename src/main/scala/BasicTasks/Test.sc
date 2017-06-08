def applyDiscount(discount:String) = {
  println(s"discount code: $discount")
}

def applyDiscount(discount:Int) = {
  println(s"discount value: $discount")
}

applyDiscount("Coupon-10")
applyDiscount(10)