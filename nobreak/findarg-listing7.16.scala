// findarg-listing7.16.scala

// usage: scala findarg-listing7.16.scala < args list >

var i = 0
var foundIt = false
while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
      println(args(i))
  }
  i = i + 1
}

