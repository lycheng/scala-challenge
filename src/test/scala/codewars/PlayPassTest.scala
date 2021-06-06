package me.lycheng
package codewars

import org.scalatest._
import org.scalatest.Assertions._

import PlayPassTest._

class PlayPassTest extends FlatSpec {
  it should "pass basic tests" in {
    dotest("I LOVE YOU!!!", 1, "!!!vPz fWpM J")
    dotest("I LOVE YOU!!!", 0, "!!!uOy eVoL I")
    dotest("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2, "4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO")

  }
}

object PlayPassTest {
  private def dotest(s: String, n: Int, expect: String): Unit = {
    println("Testing:\n" + s + ", " + n)
    val actual: String = PlayPass.playPass(s, n)
    println("Actual: " + actual)
    println("Expect: " + expect)
    println("*")
    assertResult(expect){actual}
  }
}
