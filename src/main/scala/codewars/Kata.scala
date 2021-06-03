package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

/**
 * https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/scala
 */
object Kata {
  def partsSums(l: List[Int]): List[Int] = {
    // use List will timeout
    var vt = Vector(0)
    l.reverse.foreach(n => vt = vt :+ (vt.last + n))
    vt.reverse.toList
  }
}
