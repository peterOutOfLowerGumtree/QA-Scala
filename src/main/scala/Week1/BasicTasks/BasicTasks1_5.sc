// 1: Hello World!
println("Hello World!")

// 2: Assignment
lazy val helloWorld = "Hello World!"
println(helloWorld)

// 3: Parameters
lazy val parameters: String = {
  "Hello World!"
}
println(parameters)

// 4: Return types
lazy val returnString: String = {
  lazy val string = "Hello World!"
  string
}
println(returnString)

// 5: Type Inference
def returnAny(a: Any) = {
  a
}
println(returnAny(4.4568745 + " Hi " + 3 + " " + true))