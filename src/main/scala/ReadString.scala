import scala.collection.mutable.ArrayBuffer
import java.util.Scanner

object ReadString extends App {
  var inputArray:ArrayBuffer[Any] = new ArrayBuffer[Any]
  var finalInput = ""
  val scanner = new Scanner(System.in)
  def readString(input: String): Unit = {
    step2(input)
    for(i<-inputArray.indices)
      inputArray(i) = inputArray(i).toString.toLowerCase
    step1
    finalInput = finalInput.reverse
    step4;scanner.close}
  def step2(input:String): Unit = {
    def lowerInput = input.toUpperCase.toCharArray
    for(i<- lowerInput.indices) inputArray += lowerInput(i)}
  def step1 = for(i<-inputArray.indices) finalInput += inputArray(i).toString
  def step4 = {
    for(i<-0 until inputArray.length) {
      print({
        finalInput(((inputArray).length-1)-i)
      })}}
  readString("{curly boys}")
}