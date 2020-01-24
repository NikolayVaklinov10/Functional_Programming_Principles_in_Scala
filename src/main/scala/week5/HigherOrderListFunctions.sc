

// A simple way to define a map
abstract class List[T]{
  def map[U](f: T => U): List[U] = this match {
    case Nil  => this
    case x :: xs => f(x) :: xs.map(f)

  }
}

// Functions to square each element of a list with map and Pattern Matching

def squareList(xs: List[Int]): List[Int] = xs match{
  case Nil => Nil
  case y :: ys => y * y :: squareList(ys)
}

def squareList(xs:List[Int]): List[Int] =
  xs map (x => x * x)

// Another common operation on lists is the selection of all elements
// satisfying a given condition. For example:

def posElems(xs: List[Int]): List[Int] = xs match{
  case Nil => xs
  case y :: ys => if(y > 0) y :: posElems(ys) else posElems(ys)
}


// the method filter

abstract class List[T]{
  def filter(p: T => Boolean): List[T] = this match {
    case Nil => this
    case x :: xs => if (p(x)) x :: xs.filter(p) else xs.filter(p)
  }
}

// Using filter, posElem can be written more concisely
def posElems(xs: List[Int]): List[Int] =
  xs filter (x => x > 0)







