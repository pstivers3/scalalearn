import org.scalatest.FunSuite
import layout.Element // me added
import Element.elem
class ElementSuite extends FunSuite {
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    expect(2) {
      ele.width
    }
  }
//  intercept[IllegalArgumentException] {
//    elem('x', -2, 3)
//  }
}

