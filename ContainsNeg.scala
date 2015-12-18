def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
val check = containsNeg(List(1, 2, -3, 4))
println(check)
