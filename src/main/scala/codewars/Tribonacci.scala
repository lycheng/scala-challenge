package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

/**
 * https://www.codewars.com/kata/556deca17c58da83c00002db/train/scala
 */
object Tribonacci {
  def tribonacci[T : Numeric](signature: List[T], n: Int): List[T] = {
    var seq = ArrayBuffer[T]() ++: signature;
    for (i <- 2 to n - 2) seq = seq.appended(seq.slice(i - 2, i + 1).sum)
    seq.slice(0, n)
  }
}
