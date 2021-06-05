package me.lycheng
package codewars

import scala.collection.mutable.ArrayBuffer

object Kata {

  /**
   * https://www.codewars.com/kata/5ce399e0047a45001c853c2b/train/scala
   * @param l list of int
   * @return
   */
  def partsSums(l: List[Int]): List[Int] = {
    // use List will timeout
    var vt = Vector(0)
    l.reverse.foreach(n => vt = vt :+ (vt.last + n))
    vt.reverse.toList
  }

  /**
   * https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/scala
   * @param xs list of int
   * @return String of int
   */
  def solution(xs: List[Int]): String = {
    if (xs.isEmpty) {
      return ""
    }
    val rv = ArrayBuffer[String]()
    var vec = ArrayBuffer(xs.head)
    xs.tail.foreach(n => {
      if (vec.isEmpty || n - vec.last == 1) {
        vec += n
      } else {
        rv += buffToString(vec)
        vec = ArrayBuffer(n)
      }
    })
    rv += buffToString(vec)
    rv.mkString(",")
  }

  def buffToString(vec: ArrayBuffer[Int]): String = vec.length match {
    case 1 | 2  => vec.mkString(",")
    case _ => s"${vec.head}-${vec.last}"
  }

  def main(args: Array[String]): Unit = {
    println(solution(List(-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20)))
  }
}
