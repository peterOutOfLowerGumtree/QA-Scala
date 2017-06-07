def uniqueSum(a: Int, b: Int, c: Int): Int = {
  if (a == b && a == c && b == c) 0
  else if (a == b) c
  else if (a == c) b
  else if (b == c) a
  else a + b + c
}

println(uniqueSum(1, 2, 3))