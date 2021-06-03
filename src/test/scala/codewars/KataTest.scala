package me.lycheng
package codewars

import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.partsSums(List()) === List(0))
    assert(Kata.partsSums(List(0, 1, 3, 6, 10)) === List(20, 20, 19, 16, 10, 0))
    assert(Kata.partsSums(List(1, 2, 3, 4, 5, 6)) === List(21, 20, 18, 15, 11, 6, 0))
  }
}
