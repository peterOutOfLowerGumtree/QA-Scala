package Week2.Garage

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

case class Part (name: String, cost: Double, var isFixed: Boolean)


object Part {
  def create(name: Int, isFixed:Boolean): Part = name match{
    case 1 => Part("Part1",10,isFixed)
    case 2 => Part("Part2",11,isFixed)
    case 3 => Part("Part3",12,isFixed)
    case 4 => Part("Part4",13,isFixed)
    case 5 => Part("Part5",14,isFixed)
    case 6 => Part("Part6",15,isFixed)
    case 7 => Part("Part7",16,isFixed)
    case 8 => Part("Part8",17,isFixed)
    case 9 => Part("Part9",18,isFixed)
    case 10 => Part("Part10",19,isFixed)
    case 11 => Part("Part11",20,isFixed)
    case 12 => Part("Part12",21,isFixed)
    case 13 => Part("Part13",22,isFixed)
    case 14 => Part("Part14",23,isFixed)
    case 15 => Part("Part15",24,isFixed)
    case _ => throw new IllegalArgumentException
  }


}
