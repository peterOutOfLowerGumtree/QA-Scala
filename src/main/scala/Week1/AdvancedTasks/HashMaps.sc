import scala.io.Source

def readWords(input: String) = input.split(" ").mkString
readWords("Hello world! I am the best!") // Test

def alphabet(input: String) = input.sorted
alphabet("bac") // Test

val filename: String = "C:\\Users\\Administrator\\Documents\\JMW WK 6\\file.txt"
val fileContents = Source.fromFile(filename).getLines().map(f => f.toLowerCase)
fileContents foreach (f => println(alphabet(f)))
