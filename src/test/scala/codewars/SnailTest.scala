package me.lycheng
package codewars

import org.scalatest._

class SnailTest extends FlatSpec {

  import Snail.snail

  "First example" should "work" in {
    val input = List(
      List(1, 2, 3),
      List(4, 5, 6),
      List(7, 8, 9))
    val res = List(1, 2, 3, 6, 9, 8, 7, 4, 5)
    assert(snail(input) == res)
  }

  "Second example" should "work" in {
    val input = List(
      List(1, 2, 3),
      List(8, 9, 4),
      List(7, 6, 5))
    val res = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    assert(snail(input) == res)
  }

  "Third example" should "work" in {
    val input = List(
      List(1, 2, 3, 4, 5),
      List(16, 17, 18, 19, 6),
      List(15, 24, 25, 20, 7),
      List(14, 23, 22, 21, 8),
      List(13, 12, 11, 10, 9)
    )
    val res = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)
    assert(snail(input) == res)
  }
}
