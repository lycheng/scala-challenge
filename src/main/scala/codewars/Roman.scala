package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/51b6249c4612257ac0000005/train/scala
 */
object Roman {

  def decode(roman: String): Int = {
    if (roman.isEmpty) return 0
    var rv = toValue(roman.charAt(0))
    for (i <- 1 until(roman.length)) {
      val prev = toValue(roman.charAt(i - 1))
      val curr = toValue(roman.charAt(i))
      if (curr > prev) rv += curr - prev * 2
      else rv += curr
    }
    rv
  }

  def toValue(c: Char): Int = c match {
    case 'I' => 1
    case 'V' => 5
    case 'X' => 10
    case 'L' => 50
    case 'C' => 100
    case 'D' => 500
    case 'M' => 1_000
  }
}
