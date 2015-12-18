// createUsers.scala

private def run( command: String ): Int = {
  try {
    // println( "gonna run command: " + command )
    val rt = java.lang.Runtime.getRuntime()
    val p = rt.exec( command )

    // Show exit code of process
    val wf = p.waitFor()
    val exitVal = p.exitValue()

    // log.debug( command +" end with an exit value of: "+ exitVal )
    return exitVal

  } catch {
    case e: Exception => {
      //log.error( "", e )
      return 1
    }
  }
}

run(ls)
