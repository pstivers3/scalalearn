package bobsdelights
// package object bobsdelights{
//   def showFruit(fruit: Fruit) {
//     import fruit._
//     println(name +"s are "+ color)
//   }
// }
abstract class Fruit(
  val name: String,
  val color: String
)
object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}

