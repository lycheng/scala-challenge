package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/559536379512a64472000053/train/scala
 */
object PlayPass {
  def playPass(s: String, n: Int): String = {
    val shifted = for (c <- s) yield c match {
      case c if (c >= 'a' && c <= 'z') => ((c - 'a' + n) % 26 + 'a').toChar
      case c if (c >= 'A' && c <= 'Z') => ((c - 'A' + n) % 26 + 'A').toChar
      case c if c >= '0' && c <= '9' => ('9' - c + '0').toChar
      case _ => c
    }
    val rv = for ((c, i) <- shifted.zipWithIndex) yield c match {
      case c if (i % 2 == 1) && (c >= 'A' && c <= 'Z') => (c - 'A' + 'a').toChar
      case c if (i % 2 == 0) && (c >= 'a' && c <= 'z') => (c - 'a' + 'A').toChar
      case _ => c
    }
    rv.reverse.mkString("")
  }
}
