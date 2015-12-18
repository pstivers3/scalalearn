// file-reader.scala
// usage: scala file-reader.scala

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
try {
  val f = new FileReader("input.txt")
  println(f) 
} catch {
  case ex: FileNotFoundException => println("file is missing") 
  case ex: IOException => // Handle other I/O error
}
