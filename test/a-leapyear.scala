// パス: lx02/test/a-leapyear.scala
// エンコーディング: UTF8

package leapyear

import org.scalatest._
import Main._

class Test extends FlatSpec with Matchers {

  "leapyear" should "be true for 4で割り切れる年" in {
    leapyear(2004) should be (true)
    leapyear(2008) should be (true)
  }
}
