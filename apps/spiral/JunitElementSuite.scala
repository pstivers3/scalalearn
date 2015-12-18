import org.scalatest.junit.JUnit3Suite
import layout.Element // me added
import Element.elem
class ElementSuite extends JUnit3Suite {
  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    expect(3) { ele.height }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}

