
case class Person(name: String, age: Int) {
  def canMarry: Boolean = age > 21
}

val person = new Person("mushtaq", 22)
val person2 = new Person("mushtaq", 22)

person.canMarry

person == person2
person.hashCode()
person2.hashCode()

person.name

person.copy(age = 33)

sealed trait Customer
case object Reward extends Customer
case object Regular extends Customer

Reward
