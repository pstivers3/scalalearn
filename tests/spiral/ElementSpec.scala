import org.scalatest.FlatSpec
import layout.Element // me added
import org.scalatest.matchers.ShouldMatchers
import Element.elem
class ElementSpec extends FlatSpec with ShouldMatchers {
  "A UniformElement" should
      "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be (5)
  }
  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }
  it should "throw an IAE if passed a string value" in {
    evaluating {
      elem('x', -2, 3)
    } should produce [IllegalArgumentException]
  }
}

