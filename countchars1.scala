// countchars1.scala
// usage: scala countchars1.scala <filename>

import scala.io.Source

if (args.length > 0) {

  for (line <- Source.fromFile(args(0)).getLines())
    println(line.length +" "+ line)
}
else
  Console.err.println("Please enter filename")

