// 15: Pattern Matching 1
def patternMatching1a(num1: Int, num2: Int, ifTrue: Boolean): Int = ifTrue match {
  case true => num1 + num2
  case false => num1 * num2
}
println(patternMatching1a(3, 4, true))
println(patternMatching1a(3, 4, false))

def patternMatching1b(num1: Int, num2: Int, ifTrue: Boolean): Int = num1 match {
  case 0 => num2
  case _ => num2 match {
    case 0 => num1
    case _ => ifTrue match {
      case true => num1 + num2
      case false => num1 * num2
    }
  }
}
println(patternMatching1b(0, 4, true)) // Return num2
println(patternMatching1b(23, 0, true)) // Return num1
println(patternMatching1b(0, 0, true)) // Return 0
println(patternMatching1b(3, 4, true)) // Sum
println(patternMatching1b(3, 4, false)) // Multiply

// 16: Pattern Matching 2
def patternMatching2(any: Any): Any = any match {
  case Array(a,b) => (b,a)
  case List(a,b) => (b,a)
  case (a,b) => (b,a)
  case _ => "You're a fool"
}
println(patternMatching2(1,2,8))

// 17: Functional 1
var availableIDs = java.util.TimeZone.getAvailableIDs.map(line => line.split('/')).filter(_.length > 1).map(line => line(1)).grouped(10).map(line => line(0)).toArray






















