package Week2

object Sum {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int

  def sumInts = sum(x => x)                       //> sumInts: => (Int, Int) => Int
  def sumCubes = sum(x => x * x * x)              //> sumCubes: => (Int, Int) => Int

  {
    def sum(f: Int => Int)(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sum(f)(a + 1, b)
  }
  
                                                  
}