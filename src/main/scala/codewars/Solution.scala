package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/54da539698b8a2ad76000228/train/scala
 */
object Solution {
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
}
