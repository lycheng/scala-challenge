package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/scala
 */
object Bus {
  def number(busStops: List[(Int, Int)]): Int = {
    busStops.map(t => {
      t._1 - t._2
    }).sum
  }
}
