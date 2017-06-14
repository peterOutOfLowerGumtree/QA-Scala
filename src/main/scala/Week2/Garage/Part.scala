package Week2.Garage

case class Part (name: String, cost: Double, var isFixed: Boolean)

object Part {
  def create(name: String, isFixed:Boolean): Part = name match{
    case "part1" => Part("Part1",10.00,isFixed)
    case "part2" => Part("Part2",11.00,isFixed)
    case "part3" => Part("Part3",12.00,isFixed)
    case "part4" => Part("Part4",13.00,isFixed)
    case "part5" => Part("Part5",14.00,isFixed)
    case "part6" => Part("Part6",15.00,isFixed)
    case "part7" => Part("Part7",16.00,isFixed)
    case "part8" => Part("Part8",17.00,isFixed)
    case "part9" => Part("Part9",18.00,isFixed)
    case "part10" => Part("Part10",19.00,isFixed)
    case "part11" => Part("Part11",20.00,isFixed)
    case "part12" => Part("Part12",21.00,isFixed)
    case "part13" => Part("Part13",22.00,isFixed)
    case "part14" => Part("Part14",23.00,isFixed)
    case "part15" => Part("Part15",24.00,isFixed)
    case _ => throw new IllegalArgumentException
  }
}
