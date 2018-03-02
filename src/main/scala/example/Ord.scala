package example

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = new Ord[Int] {
    override def lt(a: Int, b: Int): Boolean = a < b
  }
}
