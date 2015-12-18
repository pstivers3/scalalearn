// make-ssh-aliases
// Paul Stivers
// last updated: 2012-04-06

import scala.io.Source

def makealias() = {
  val lines = Source.fromFile("fqdn.list").getLines().toList
  for (line <- lines){
    line match {  
      case (line.charAt(0) == '#') => println(line)
      case (line.charAt(0) == 'e') => println("alias " + alias + "='ssh " + user + "@" + line + "'") 
    }
  }
}

