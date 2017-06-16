package Week1.AdvancedTasks

import scala.io.Source

/**
  * Created by Administrator on 15/06/2017.
  */
object HashMaps extends App {
  import java.util

  import scala.collection.mutable.{ArrayBuffer}

  def readWords(input: String) = input.split("\n")
  readWords("Hello world! I am the best!") // Test

  def alphabet(input: String): String = input.sorted
  alphabet("bac") // Test


  def fileContents: Array[String] = Source.fromFile("C:\\Users\\Administrator\\Documents\\JMW WK 6\\wordList.txt").getLines().map(_.toLowerCase).toArray.sortWith(_.length > _.length)
//  val fileContents = "C:\\Users\\Administrator\\Documents\\JMW WK 6\\wordList.txt"

  println("Words of longest length:")
  val longest = fileContents.sortWith(_.length > _.length).head.toString.length
  var count = 0
  for(i<-0 until longest) {
    if(fileContents(i).length == longest) println(fileContents(i))
    count += 1
  }

  println()
  println("String size:")
  println(count)

//  def findAnagrams(input:Array[String]): Unit = {
//
//  }
//
//  findAnagrams(fileContents)
}
