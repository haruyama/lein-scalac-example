package org.unixuser.haruyama.lein.scalac
import org.scalatest._

class ExampleTest extends FlatSpec with ShouldMatchers {
  "Example" should "add integers" in {
    val example = new Example
    example.add(1,2) should equal (3)
  }
}
