package me.lycheng
package codewars

import org.scalatest._

class ExesAndOhsTest extends FlatSpec with Matchers {

  val tests = List(
    ("xo0", true),
    ("xo", true),
    ("xxxoo", false)
  )

  tests.foreach {
    case (input, expected) =>
      s"xo($input)" should s"return $expected" in {
        ExesAndOhs.xo(input) should be (expected)
      }
  }
}
