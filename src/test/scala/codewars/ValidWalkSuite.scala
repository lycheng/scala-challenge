package me.lycheng
package codewars

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest._
import Solution._

@RunWith(classOf[JUnitRunner])
class ValidWalkSuite extends FunSpec {

  val validWalks = Seq(
    Seq('n','s','n','s','n','s','n','s','n','s'),
  )

  val invalidWalks = Seq(
    Seq('w','e','w','e','w','e','w','e','w','e','w','e'),
    Seq('w'),
    Seq('n','n','n','s','n','s','n','s','n','s')
  )

  validWalks.foreach { valid =>
    it(s"should return true for $valid") {
      assert(isValidWalk(valid))
    }
  }

  invalidWalks.foreach { invalid =>
    it(s"should return false for $invalid") {
      assert(!isValidWalk(invalid))
    }
  }
}