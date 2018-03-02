package example

object Sorter {
  def insert[T](x: T, xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => List(x)
    case head :: tail => if (ord.lt(x, head)) x :: xs else head :: insert(x, tail)(ord)
  }

  def sort[T](xs: List[T])(ord: Ord[T]): List[T] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail)(ord))(ord)
  }
}
