def evenlySpaced(int1: Int, int2: Int, int3: Int): Boolean = {
  if(Math.abs(int1-int2) == Math.abs(int2-int3) ||
    Math.abs(int1-int2) == Math.abs(int1-int3)||
    Math.abs(int2-int3) == Math.abs(int1-int3)) true
  else false
}

evenlySpaced(2,4,6)
evenlySpaced(4,6,2)
evenlySpaced(4,6,3)