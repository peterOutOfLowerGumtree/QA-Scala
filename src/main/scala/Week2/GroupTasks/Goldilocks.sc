def goldilocks(input: String): Unit = {
  val goldilist = input.split("\n")
  val goldilocksInfo = goldilist(0).split(" ")
  val weight = goldilocksInfo(0).toInt
  val temp = goldilocksInfo(1).toInt
  println(s"Goldilocks weight: $weight; Goldilocks max temp: $temp")

  for(i<-1 to goldilist.length-1) {
    val bearInfo = goldilist(i).split(" ")
    val bearWeight = bearInfo(0).toInt
    val bearTemp = bearInfo(1).toInt
    (weight, temp) match {
      case _ if bearTemp < temp && bearWeight > weight => println(s"Goldilocks is fussy and " +
        s"can sit on a seat with weight of $bearWeight and eat $bearTemp degree food")
      case _ =>
    }
  }
}

goldilocks("100 80\n30 50\n130 75\n90" +
  " 60\n150 85\n120 70\n200 200\n110 100")

goldilocks("100 120\n297 90\n66 110\n257 113\n276 191\n280 129\n219 163" +
  "\n254 193\n86 153\n206 147\n71 137\n104 40\n238 127\n52 146\n129 197\n144 59" +
  "\n157 124\n210 59\n11 54\n268 119\n261 121\n12 189\n186 108\n174 21\n77 18\n" +
  "54 90\n174 52\n16 129\n59 181\n290 123\n248 132")