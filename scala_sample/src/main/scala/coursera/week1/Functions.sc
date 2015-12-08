object Functions {

  def id(x: Int): Int = x
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0 else a + sumInts(a + 1, b)

  def cube(x: Int): Int = x * x * x
  def sumCubes(a: Int, b: Int): Int =
    if (a > b) 0 else cube(a) + sumCubes(a + 1, b)

  def fact(a: Int): Int =
    if (a == 0) 1 else a * fact(a - 1)

  def sumFactorials(a: Int, b: Int): Int =
    if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def summ(f:Int=> Int, a :Int, b: Int) :Int = {
    def loop(a :Int, acc:Int) : Int = {
        if (a>b) acc else  loop( a+1 ,acc + f(a))
    }
    loop(a, 0)
  }

  def summm(f:Int=> Int ) : ( Int, Int) => Int = {
    def sumF(a :Int, b:Int) : Int = {
      if (a>b) 0 else f(a) + sumF(a+1, b)
    }
    sumF
  }


  sumInts(3, 6)
  sumCubes(3, 6)
  sumFactorials(3, 6)

  def summInt(a: Int, b: Int) = summ(x => x, a, b)
  def summCubes(a: Int, b: Int) = summ(cube, a, b)

  sum(id, 3, 6)
  sum(cube, 3, 6)
  sum(fact, 3, 6)
  summCubes (3,6)

  sum(x => x, 3, 6)
  sum((x: Int) => x * x * x, 3, 6)


  summm(id)(3,6)
}