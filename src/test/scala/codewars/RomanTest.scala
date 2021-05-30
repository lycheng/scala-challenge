package me.lycheng
package codewars

import org.scalatest.FunSuite

class RomanTest extends FunSuite {

  test("Samples") {
    assert(Roman.decode("I") === 1)
    assert(Roman.decode("III") === 3)
    assert(Roman.decode("IV") === 4)
    assert(Roman.decode("XXI") === 21)
    assert(Roman.decode("MDCLXVI") === 1666)
    assert(Roman.decode("MCMXC") === 1990)
    assert(Roman.decode("MMVIII") === 2008)
  }
}
