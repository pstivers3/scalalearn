// printfile.scala

// usage: scala printfiles.scala

val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere)
  println(file)

