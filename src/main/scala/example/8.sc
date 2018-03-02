import example.{Book, Ord, Sorter}

Sorter.sort(List(2, 3, 5, 1, 8))
Sorter.sort(List("z", "a", "s"))
Sorter.sort(List(Some(2), None, Some(1)))
Sorter.sort(List(Some("s"), None, Some("a")))


Sorter.sort(
  List(Some(Book("some1", 100)), None, Some(Book("some1", 34)))
)


{

  implicit val strOrd: Ord[String] = (a: String, b: String) => a > b
  Sorter.sort(List(Some("s"), None, Some("a")))

}

