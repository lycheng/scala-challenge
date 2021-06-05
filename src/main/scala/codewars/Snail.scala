package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

/**
 * https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/scala
 *
 * best practices is matrix transpose
 *  x :: xs => x ++ snail(xs.transpose.reverse)
 */
object Snail {
  def snail(xs: List[List[Int]]): List[Int] = {
    var rv = ArrayBuffer[Int]()
    if (xs.isEmpty || xs.head.isEmpty)
      return rv.toList
    val flag = Array.ofDim[Boolean](xs.length, xs.head.length)
    var (i, j) = (0, 0)
    var d = 0 // To i, j + 1
    do {
      rv += xs(i)(j)
      flag(i)(j) = true
      val (nextI, nextJ, nextD) = next(i, j, d, flag)
      i = nextI
      j = nextJ
      d = nextD
    } while (!flag(i)(j))
    rv.toList
  }

  def next(i: Int, j: Int, d: Int, flag: Array[Array[Boolean]]): (Int, Int, Int) = {
    val n = d match {
      case 0 => List((i, j + 1), (i + 1, j))
      case 1 => List((i + 1, j), (i, j - 1))
      case 2 => List((i, j - 1), (i - 1, j))
      case 3 => List((i - 1, j), (i, j + 1))
    }
    if (isValidMove(n.head._1, n.head._2, flag))
      (n.head._1, n.head._2, d)
    else if (isValidMove(n.last._1, n.last._2, flag))
      (n.last._1, n.last._2, (d + 1) % 4)
    else (i, j, d)
  }

  def isValidMove(i: Int, j: Int, flag: Array[Array[Boolean]]): Boolean = {
    i >= 0 && i < flag.length && j >= 0 && j < flag.length && !flag(i)(j)
  }
}
