object anonymous_func extends App {
  val ints = List(1,2,3,4)
  println(ints)

  val double = ints.map(_*2)
  println(double)

  val x = ints.filter(_>2)
  println(x)

  val num = (1 to 10).toList

  num.foreach(print)
  println()
  println(num.head, num.tail, num.take(2))

  println(num.drop(4))


  //reduce
  val a = List(1,2,3)

  def add(x: Int, y: Int): Int = {
    val theSum = x + y
    println(theSum)
    theSum
  }

  a.reduce(add)
}
