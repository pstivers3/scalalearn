// tail recursive
// pg 202, PDF

def approximate(guess: Int): Int = {
  def isGoodEnough(guess: Int): Boolean = ((guess - 20) < 4) 
  def improve(guess: Int) = guess - 2
  println("guess = " + guess)
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))
}

approximate(40)
