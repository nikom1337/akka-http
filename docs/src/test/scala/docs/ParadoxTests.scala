package docs

import akka.ParadoxSupport
import org.scalatest.{ Matchers, WordSpec }

class ParadoxTests extends WordSpec with Matchers {

  "testing" in {

    println("tests 1")

    new ParadoxSupport.UnidocDirective(Array.empty)

    println("tests 2")
  }
}
