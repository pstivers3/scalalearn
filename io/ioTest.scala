// usage: scala ioTest.scala

import java.io._
val in = new BufferedReader(new InputStreamReader(System.in))
var line = "initial"
while ( line != "" ) {
  line = in.readLine()
  println(line)
} 
