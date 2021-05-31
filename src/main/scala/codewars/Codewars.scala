package me.lycheng
package codewars

import scala.collection.mutable.ListBuffer

/**
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/scala
 *
 * best practices:
 *   sentence.split(" ").map(x => if ( x.size >= 5 ) x.reverse else x).mkString(" ")
 */
object Codewars {
  def spinWords(sentence: String): String = {
    val words = new ListBuffer[String]()
    sentence.split(" ").foreach(word => {
      if (word.length < 5) words += word
      else words += word.reverse
    })
    words.mkString(" ")
  }
}
