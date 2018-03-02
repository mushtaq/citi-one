package example

case class Book(name: String, price: Double)

object Book {
  implicit val bookOrd: Ord[Book] = new Ord[Book] {
    override def lt(a: Book, b: Book): Boolean = a.price < b.price
  }
}
