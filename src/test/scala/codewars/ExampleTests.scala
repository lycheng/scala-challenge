package me.lycheng
package codewars

import org.scalatest.FunSpec

class ExampleTests extends FunSpec {
  describe("Codewars.spinWords") {
    it("should work with example tests") {
      assertResult ("emocleW") {Codewars.spinWords("Welcome")}
      assertResult ("Hey wollef sroirraw") {Codewars.spinWords("Hey fellow warriors")}
      assertResult ("This is a test") {Codewars.spinWords("This is a test")}
      assertResult ("This is rehtona test") {Codewars.spinWords("This is another test")}
      assertResult ("You are tsomla to the last test") {Codewars.spinWords("You are almost to the last test")}
      assertResult ("Just gniddik ereht is llits one more") {Codewars.spinWords("Just kidding there is still one more")}
      assertResult ("ylsuoireS this is the last one") {Codewars.spinWords("Seriously this is the last one")}
    }
  }
}
