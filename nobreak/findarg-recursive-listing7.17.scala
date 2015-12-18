// findarg-recursive-listing7.17.scala

// usage: scala findarg-recursive-listing7.17.scala <list of args>

def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")){
    println(args(i))
    i
  }
  else searchFrom(i + 1)
val i = searchFrom(0)

