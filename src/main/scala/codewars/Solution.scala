package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

object Solution {

  private var cache = ArrayBuffer[BigInt](0, 1)

  def cal(n: Int): BigInt = {
    for (i <- cache.length to n) cache += cache(i - 1) + cache(i - 2)
    cache(n)
  }

  def fib(n: Int): BigInt = {
    if (n < cache.length) cache(n)
    else cal(n)
  }

  /**
   * https://www.codewars.com/kata/54da539698b8a2ad76000228/train/scala
   * @param walk sequence of direction
   * @return
   */
  def isValidWalk(walk: Seq[Char]): Boolean = {
    if (walk.length != 10)
      return false

    var (x, y) = (0, 0)
    walk.foreach {
      case 'n' => y += 1
      case 's' => y -= 1
      case 'e' => x += 1
      case 'w' => x -= 1
    }
    x == 0 && y == 0
  }

  /**
   * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/train/scala
   * @param n factorial of n
   * @return
   */
  def zeros(n: Int): Int = {
    var count = 0
    var i = 5
    while (n / i >= 1) {
      count += n / i
      i *= 5
    }
    count
  }
}
