def exec = Runtime.getRuntime.exec(_:String)
new io.BufferedSource(exec("ls").getInputStream) foreach print
