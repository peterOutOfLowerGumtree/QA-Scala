def blackjack (num1:Int, num2:Int): Any = {
  if (num1>num2 && num1<=21) "Player 1 wins!"
  else if (num1<num2 && num2>21) "Player 1 wins!"
  else if (num2>num1 && num2<=21) "Player 2 wins!"
  else if (num2<num1 && num1>21) "Player 2 wins!"
  else "No one wins!"
}
println(blackjack(21,21))