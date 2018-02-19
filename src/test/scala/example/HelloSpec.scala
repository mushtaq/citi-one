package example

import org.scalatest._

class HelloSpec extends FunSuite with Matchers {
  test("The Hello object") {
    Hello.greeting shouldEqual "hello"

  }
}
