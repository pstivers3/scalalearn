// printarts.scala
// usage: scala printargs.scala [arg1] [arg1] ...

println("\nargs.length = " + args.length)

println("\nListing one arg per line\n")
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}

println("\nListing all args on one line\n")

var k = 0 
while (k < args.length) {
  if (k != 0)
    print(" ")
  print(args(k))
  k += 1
}
println("\n")
