

class Person(val name: String, val age: Int)
object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
}

val p = Person("mushtaq", 33)
val Person(name, age) = p

name
age


p match {
  case Person(name, age) => s"hello $name of age=$age"
}
