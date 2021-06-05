package me.lycheng
package codewars

import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Samples") {
    assert(Kata.partsSums(List()) === List(0))
    assert(Kata.partsSums(List(0, 1, 3, 6, 10)) === List(20, 20, 19, 16, 10, 0))
    assert(Kata.partsSums(List(1, 2, 3, 4, 5, 6)) === List(21, 20, 18, 15, 11, 6, 0))
  }

  test("Sample 1") {
    assert(Kata.solution(List(-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20)) === "-6,-3-1,3-5,7-11,14,15,17-20")
  }

  test("Sample 2") {
    assert(Kata.solution(List(-3,-2,-1,2,10,15,16,18,19,20)) === "-3--1,2,10,15,16,18-20")
  }
}
