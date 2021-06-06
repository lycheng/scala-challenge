package me.lycheng
package codewars

import org.scalatest._
import org.scalatest.Matchers

class SolutionTest extends FlatSpec with Matchers {

  "fib(70)" should "return 190392490709135" in {
    Solution.fib(70).toString should be ("190392490709135")
  }
  "fib(60)" should "return 1548008755920" in {
    Solution.fib(60).toString should be ("1548008755920")
  }
  "fib(50)" should "return 12586269025" in {
    Solution.fib(50).toString should be ("12586269025")
  }

  "Trailing zeros" should "work with example tests" in {
    assert(Solution.zeros(0) == 0)
    assert(Solution.zeros(6) == 1)
    assert(Solution.zeros(14) == 2)
  }
}
