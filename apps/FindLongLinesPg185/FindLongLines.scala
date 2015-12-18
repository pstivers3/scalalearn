object FindLongLines {
  def main(args: Array[String]) {
    val width = args(0).toInt  // why not just declare args as Array[Int]?
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}

