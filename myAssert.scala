def MyAssert(predicate: => Boolean): String = {
  try {
    predicate
  } catch {
    case ex: AssertionError =>
  }
  if (!assertionsEnabled)
    return "Assertion is not enabled"
  else if (assertionsEnabled && predicate)
    return "true"
  else
    return "false"
}

var assertionsEnabled = true
println("\nAssertionEnabled is " + assertionsEnabled)
println("5 > 3 is: " + MyAssert(5 > 3))
println("5 == 3 is: " + MyAssert(5 == 3))

assertionsEnabled = false
println("\nAssertionEnabled is " + assertionsEnabled)
println("5 < 3 is: " + MyAssert(5 < 3))
println("5 == 3 is: " + MyAssert(5 == 3))

