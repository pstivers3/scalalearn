val filesHere = (new java.io.File(".")).listFiles
val files = for ( file <- filesHere ) yield {
    if( true )
    file.name
  }
println( files.toString )
