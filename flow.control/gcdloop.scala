// gcdloop.scala

// usage: scala gcdloop.scala 

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  // println(b)
  b
}

gcdLoop(102, 78)
