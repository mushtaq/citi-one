import example.{Ord, Sorter}

Sorter.sort(List(2, 3, 5, 1, 8))(Ord.intOrd)
Sorter.sort(List("z", "a", "s"))(Ord.intOrd)
