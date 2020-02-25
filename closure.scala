
object closure extends App {
  val a =10
  val sum = (b:Int) => b + a

  println("sum 1", sum(1))
  println("sum 2", sum(2))
  println("sum 3", sum(3))
}
