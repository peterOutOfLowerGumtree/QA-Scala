import java.util

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.io.Source

def readWords(input: String) = input.split(" ")
readWords("Hello world! I am the best!") // Test

def alphabet(input: String): String = input.sorted
alphabet("bac") // Test

val regEx = """([A-Za-z])+""".r // RegEx
var filename = ""


def fileContents(input: String) = Source.fromFile(input).getLines().map(_.toLowerCase).flatMap(regEx.findAllIn)


def findHighest(input:Iterator[String]): String = {
  var highestLength = 0
  var highestWord: String = ""
  for(line <- fileContents(filename)) {
    if(line.length > highestLength) {
      highestLength = line.length
      highestWord = line.toString
    }
  }
  highestWord
}

def findAnagrams(input:Iterator[String]): Int = {
  var anagramMap = Map.empty[String,ArrayBuffer[String]]
  for(i<-0 until fileContents(filename).length) {
    val temp = alphabet(fileContents(filename)
  }
}


filename = "C:\\Users\\Administrator\\Documents\\JMW WK 6\\file.txt"
//filename = "C:\\Users\\Administrator\\Documents\\JMW WK 6\\wordList.txt"
//findHighest(fileContents(filename))
findAnagrams(fileContents(filename))
























