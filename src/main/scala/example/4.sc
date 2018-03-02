
sealed trait Customer
object Customer {
  case object Reward extends Customer
  case class Regular(name: String) extends Customer
}

sealed trait Option[T]
case object None extends Option[_]
case class Some[T](value: T) extends Option[T]

sealed trait List[T]
case object Nil extends List[_]
case class Cons[T](head: T, tail: List[T]) extends List[T]


sealed trait Tree[T]
case class Node[T](left: Tree[T], right: Tree[T]) extends Tree[T]
case class Leaf[T](value: T) extends Tree[T]

sealed trait Json
case object JsNull extends Json
case class JsString(value: String) extends Json
case class JsNumber(value: Double) extends Json
case class JsBoolean(value: Double) extends Json
case class JsArray(values: List[Json]) extends Json
case class JsObject(values: Map[String, Json]) extends Json

