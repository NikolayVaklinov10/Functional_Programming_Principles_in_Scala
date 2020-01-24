// Merge Sort Algorithm in Scala
def msort(xs: List[Int]): List[Int] = {
  val n = xs.length/2
  if (n == 0) xs
  else{
    def merge(xs: List[Int], ys: List[Int]) = ???
    val (fst, snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}



// definition of merge function
def merge(xs: List[Int], ys: List[Int]) =
  xs match{
    case Nil =>
      ys
    case x :: xs1 =>
      ys match {
        case Nil =>
          xs
        case y :: ys1 =>
          if (x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
  }

// Rewrite merge using a patter matching over pairs
def msort(xs: List[Int]): List[Int] = {
  val n = xs.length/2
  if (n == 0) xs
  else{
    def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }
    val (fst, snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}

val nums = List(2,-4,5,7,1)
msort(nums)




