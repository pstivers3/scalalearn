import org.scalatest.Suite
import layout.Element
import Element.elem
class ElementSuite extends Suite {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}
