// find-scala-files-nofunc-listing7.7.scala

// usage: scala script.scala

val filesHere = (new java.io.File(".")).listFiles
for {
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
} println(file)

