package example

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {

  def apply[T](implicit x: Ord[T]): Ord[T] = x

  implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a < b

  implicit val strOrd: Ord[String] = (a: String, b: String) => a < b

  implicit def optOrd[T: Ord]: Ord[Option[T]] = new Ord[Option[T]] {
    override def lt(a: Option[T], b: Option[T]): Boolean = (a, b) match {
      case (Some(x), Some(y)) => Ord[T].lt(x, y)
      case (None, _)          => true
      case (_, None)          => false
    }
  }


}
