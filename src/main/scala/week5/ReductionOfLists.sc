//abstract class List[T]{
//  def reduceLeft(op:(T,T) => T): T = this match{
//    case Nil => throw new Error("Nil.reduceLeft")
//    case x :: xs => (xs foldLeft x)(op)
//  }
//
//  def foldLeft[U](z: U)(op: (U, T) => U): U = this match{
//    case Nil => z
//    case x :: xs => (xs foldLeft op(z,x))(op)
//  }
//}

var a=0

val odds=List(1,3,5,7,9)
for(a<-odds){
  println(a)
}






