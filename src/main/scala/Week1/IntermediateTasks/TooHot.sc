def tooHot(temp: Int)(isSummer: Boolean): Boolean = isSummer match {
  case true => 60 <= temp && temp <= 100
  case _ => 60 <= temp && temp <= 90
}

println(tooHot(80)(true))
println(tooHot(100)(false))
println(tooHot(100)(true))