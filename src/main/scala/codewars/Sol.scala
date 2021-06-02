package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

object Sol {
  private var cache = ArrayBuffer[BigInt](0, 1)

  def cal(n: Int): BigInt = {
    for (i <- cache.length to n) cache += cache(i - 1) + cache(i - 2)
    cache(n)
  }

  def fib(n: Int): BigInt = {
    if (n < cache.length) cache(n)
    else cal(n)
  }
}
