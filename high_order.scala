
object high_order extends App {
  def apply(x: Double => String, y: Double) = x(y)
  def format[A](z: A) = "{" + z.toString() + "}"

  println(apply(format,10))
}
