/*
Collection Hierarchy

        Traversable
        Iterable
   Seq    Set       Map
    ^
    |     <            <
Array   LinearSeq   Indexed Seq
        List        Vector
 */

// List
val list1: List[String] = List (
  "Guinness",
  "Stella",
  "Corona"
)
println(s"Element at index 0 = ${list1.head}")
println(s"Element at index 1 = ${list1(1)}")
println(s"Element at index 2 = ${list1(2)}")

val list2 = list1 :+ "Fosters"
val list3 = "Fosters" +: list1
val list4 = list1 :: list2
val list5 = list1 ::: list2
val list6 = List.empty

// ListBuffer
val buf = scala.collection.mutable.ListBuffer.empty[Int]
buf += 1
buf += 10
buf.toList

// Array
val array1: Array[String] = Array("Guinness","Stella", "Corona")
println(s"Element at index 0 = ${array1(0)}")
println(s"Element at index 1 = ${array1(1)}")

val array2: Array[String] = new Array(3)
array2(0) = "Guinness"
array2(1) = "Stella"
array2(2) = "Corona"

val rows = 2
val columns = 2
val array3:Array[Array[String]] = Array.ofDim(rows, columns)
array3(0)(0) = "Guinness"
array3(0)(1) = "Stella"
array3(1)(0) = "Corona"
array3(1)(1) = "Fosters"

val rangeArray: Array[Int] = (1 to 10).toArray[Int]

val copyOfRangeArray: Array[Int] = new Array(rangeArray.length)
Array.copy(rangeArray,0,copyOfRangeArray,0,rangeArray.length)