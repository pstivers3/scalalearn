// value.hiding-make-ssh-aliases.scala
// Paul Stivers
// last updated: 2012-04-06

// usage: scala make-ssh-aliases.scala <user name>

import scala.io.Source

def makealias() = {
  val lines = Source.fromFile("fqdn.list").getLines().toList
  for (line <- lines){
    if (line.charAt(0) == '#'){
      val commentSplit = line.split(" - ")
      println(commentSplit(0))
      var alias = "commentSplit(1)"
    }
    else if (line.charAt(0) == 'e'){
      println("alias " + alias + "='ssh " + args(0) + "@" + line + "'")
    }
  }
}

