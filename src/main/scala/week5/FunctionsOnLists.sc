


def last[T](xs: List[T]):T = xs match{
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys =>last(ys)
}


//Implement init as an external function, analogous to last.

def init[T](xs: List[T]): List[T] = xs match{
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y::init(ys)
}


// How can concatenation be implemented ?

def concat[T](xs: List[T], ys: List[T]) = xs match{
  case List() => ys
  case z :: zs => z :: concat(zs, ys)
}


// How can reverse be implemented ?

def  reverse[T](xs: List[T]): List[T] = xs match{
  case List() => xs
  case y :: ys =>reverse(ys) ++ List(y)
}

// Remove the n'th element of a list xs. If n is out of bounds, return xs itself

def removeAt[T](xs: List[T], n: Int) = (xs take n) ::: (xs drop n + 1)











