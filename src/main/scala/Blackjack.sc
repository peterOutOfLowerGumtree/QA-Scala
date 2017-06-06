def blackjack (num1:Int, num2:Int): Int = {
  if (num1>num2 && num1<=21) num1
  else if (num1<num2 && num2>21) num1
  else if (num2>num1 && num2<=21) num2
  else if (num2<num1 && num1>21) num2
  else 0
}
println(blackjack(18,21))
println(blackjack(20,18))
println(blackjack(22,22))