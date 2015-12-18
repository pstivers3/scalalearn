object Match {
  def main(args: Array[String]) = {
    val query = args(0)
    def filesEnding(query: String) = filesMatching(_.endsWith(query))
    def filesContaining(query: String) = filesMatching(_.contains(query))
    def filesRegex(query: String) = filesMatching(_.matches(query))
    filesContaining(query) foreach { file => print(file + "\n") }
  }
  private def filesHere = (new java.io.File(".")).listFiles
  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName)) 
      yield file
}
