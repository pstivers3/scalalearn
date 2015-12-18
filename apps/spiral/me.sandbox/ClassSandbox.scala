abstract class Element {
  def contents: Array[String]
  def height = contents.length  // element count of the array
  def width = if (height == 0) 0 else contents(0).length // character count of the first element
}

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

val elem1 = new ArrayElement(Array("aaa", "bbb", "ccc"))
println("contents = " + elem1.contents.mkString(", "))
println("height = " + elem1.height)
println("width = " + elem1.width)

