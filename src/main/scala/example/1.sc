import java.util.function.Supplier

import scala.annotation.tailrec
import scala.collection.mutable

val xs = List(1, 2, 3, 4, 5)

xs.map(x => x * x)
xs

val square: Int => Int = x => x * x
val f1: Function1[Int, Int] = x => x * x

val f2: java.util.function.Function[Int, Int] = { x =>
  x * x
}

xs.map(square)


def square2(x: Int): Int = x * x


xs.map(square2)

def map(xs: List[Int], f: Int => Int): List[Int] = {

  val buffer = mutable.Buffer.empty[Int]

  val iterator = xs.iterator
  while (iterator.hasNext) {
    buffer += f(iterator.next())
  }

  buffer.toList
}

def map2(xs: List[Int], f: Int => Int): List[Int] = {

  var list = List.empty[Int]

  val iterator = xs.iterator
  while (iterator.hasNext) {
    list = f(iterator.next()) :: list
  }

  list.reverse
}

def map3(xs: List[Int], f: Int => Int): List[Int] = {

  @tailrec
  def loop(rem: List[Int], acc: List[Int]): List[Int] = {
    if(xs.isEmpty) acc
    else loop(rem.tail, f(rem.head) :: acc)
  }

  loop(xs, List.empty).reverse
}

def reverse(xs: List[Int]): List[Int] = {
  def loop(rem: List[Int], acc: List[Int]): List[Int] = {
    if(rem.isEmpty) acc else loop(rem.tail, rem.head :: acc)
  }
  loop(xs, List.empty)
}

