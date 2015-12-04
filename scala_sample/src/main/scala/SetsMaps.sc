object SetsMaps {
  println("Sets maps")

  import collection.mutable
  val s = Set(1,2,3,3)
  val s2 = s + 4
  s

  val mutSet = mutable.Set(1,2,3)
  mutSet +=4

  val m= Map("Texas" -> "Austin", "Colorado" -> "Denver")

}