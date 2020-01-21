
def factorial(currentValue:Int): Int = {
  def loop(accumulator:Int, currentValue:Int):Int =
    if(currentValue == 0) accumulator
    else loop(accumulator * currentValue, currentValue - 1)
  loop(1, currentValue)
}
factorial(4)
