// FindScalaFilesYield.scala

// usage: scala script.scala

val filesHere = (new java.io.File(".")).listFiles
for {
  file <- filesHere
  if file.getName.endsWith(".scala")
} yield file

println(file.mkString)
