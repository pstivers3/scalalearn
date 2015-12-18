// find-scala-files-pg168.scala
// pg 168, Odersky, PDF

// usage: scala find-scala-files-pg168.scala

val filesHere = (new java.io.File(".")).listFiles
def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

val files = scalaFiles
println(files(0))
