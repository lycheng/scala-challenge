package me.lycheng
package codewars

/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/scala
 *
 * best practice: str.split(' ').sortBy(_.sorted).mkString(" ")
 */
object Text {
  def order(str: String): String = str.split(" ").sortBy(index(_)).mkString(" ")

  def index(str: String): Int = raw"(\d)".r.findFirstIn(str).get.toInt
}
