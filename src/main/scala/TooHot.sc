var upperLimit = 90
val lowerLimit = 60

def tooHot(temp:Int, isSummer:Boolean): Boolean = isSummer match {
  case true =>
    upperLimit = 100
    if (temp>upperLimit || temp<lowerLimit) false
    else true
  case _ =>
    upperLimit = 90
    if (temp>upperLimit || temp<lowerLimit) false
    else true
}
println(tooHot(80,true))
println(tooHot(100,false))
println(tooHot(100,true))