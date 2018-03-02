import scala.annotation.tailrec
import scala.collection.immutable

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case Nil          => List(x)
  case head :: tail => if (x < head) x :: xs else head :: insert(x, tail)
}

def sort(xs: List[Int]): List[Int] = xs match {
  case Nil          => Nil
  case head :: tail => insert(head, sort(tail))
}


def combine(x: Option[String], y: Option[String]): Option[String] = (x, y) match {
  case (Some(a), Some(b)) => Some(a + b)
  case (None, _)          => y
}

def reverse(xs: List[Int]): List[Int] = {
  def loop(rem: List[Int], acc: List[Int]): List[Int] = rem match {
    case Nil          => acc
    case head :: tail => loop(tail, head :: acc)
  }

  loop(xs, List.empty)
}

List(1, 2, 3)

1 :: 2 :: 3 :: Nil
