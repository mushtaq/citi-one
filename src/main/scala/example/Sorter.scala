package example

class Sorter {
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case Nil          => List(x)
    case head :: tail => if (x < head) x :: xs else head :: insert(x, tail)
  }

  def sort(xs: List[Int]): List[Int] = xs match {
    case Nil          => Nil
    case head :: tail => insert(head, sort(tail))
  }
}
