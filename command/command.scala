// command.scala

def run( command: String ): Unit = {
    val rt = java.lang.Runtime.getRuntime()
    val p = rt.exec( command )
    println(p) 
//    override def toString = rt.exec( command ) 
}

run("ls /home")

