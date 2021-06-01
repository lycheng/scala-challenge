package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/55908aad6620c066bc00002a/train/scala
 */
object ExesAndOhs {
  def xo(str: String): Boolean = {
    var xCount = 0
    var oCount = 0
    str.foreach {
      case 'X' | 'x' => xCount += 1
      case 'O' | 'o' => oCount += 1
      case _ =>
    }
    xCount == oCount
  }
}
