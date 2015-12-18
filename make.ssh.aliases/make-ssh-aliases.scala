// make-ssh-aliases.scala
// Paul Stivers
// last updated: 2012-04-06

// usage: scala make-ssh-aliases.scala <user name>

import scala.io.Source

def makealias() = {
  val lines = Source.fromFile("fqdn.list").getLines().toList
  var lineIndex = 0 
  var commentIndex = 0
  for (line <- lines){
    if (line.charAt(0) == '.'){
      println()
    }
    if (line.charAt(0) == '#'){
      commentIndex = lineIndex 
      val commentField = line.split(" - ")
      println(commentField(0))
    }
    if (line.charAt(0) == 'e'){
      val commentField2 = lines(commentIndex).split(" - ")
      println("alias s" + commentField2(1) + (lineIndex-commentIndex) + "='ssh " + args(0) + "@" + line + "'")
    }
    lineIndex += 1
  }
}

makealias()

