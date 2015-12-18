// formatargs.scala

// usage: scala formatargs.scala

// This first line is purely functional. no vars or side effects. However, it doesn't actually print anything.
def formatArgs(args: Array[String]) = args.mkString("\n")
val res = formatArgs(Array("zero", "one", "two"))

// assert method checks the passed Boolean and if it is false, throwsAssertionError. If the passed Boolean is true, assert just returns quietly.
assert(res == "zero\none\ntwo") 
println(res)
