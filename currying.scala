
object currying extends App{

  def add(a:Int, b:Int) = a+b
  println(add(1,2))

  def add2(a:Int) = (b:Int) => a+b
  println(add2(2)(3))

  def add3(a:Int)(b:Int) = a+b
  val sum = add3(3)_
  println(sum(4))
}
