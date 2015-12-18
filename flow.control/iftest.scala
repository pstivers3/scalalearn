// iftest.scala

// usage: scala iftest.scala [filename]

val filename =
  if (!args.isEmpty) args(0)
  else "default.txt"

println("\n filename = " + filename + "\n")
