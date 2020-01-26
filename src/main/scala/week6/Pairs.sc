

def isPrime(n: Int) = (2 until n) forall (n % _ != 0)


val n = 7

((1 until n) flatMap (i =>
  (1 until i) map (j => (i, j)))) filter (pair =>
    isPrime(pair._1) + pair._2)

// Use of For
// here are two examples which were previously solved with higher-order functions:
// Given a positive integer n, find all the pairs of positive integers (i,
// j) such that 1 <= j i < n, and i + j is prime.

for {
  i <- 1 until n
  j <- 1 until i
  if isPrime(i + j)
} yield (i, j)

// Write a version f scalarProduct that makes use of a for:
def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for ((x,y) <- xs zip ys) yield x * y).sum




















