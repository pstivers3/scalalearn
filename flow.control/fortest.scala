// fortest.scala

// usage: scala script.scala

val a = Array (1,2,3,4,5,6,7,8)
for {
  i <- 0 to 6
  if (a(i) <= 5)
} {
  println(a(i))
}
