object test_this  extends App {
  val DefaultSize = 10
  val DefaultType = "THIN"

  class Pizza(var size:Int, var typePizza: String) {


    def this(size: Int){
      this(size, DefaultType)
    }

    def this(typePizza: String) {
      this(DefaultSize, typePizza)
    }

    def this() {
      this(DefaultSize, DefaultType)
    }

    override def toString: String = s"($size, $typePizza)"
  }

  val p = new Pizza()
  val p1 = new Pizza(1)
  val p2 = new Pizza("ABC")
  println(p.toString)
  println(p1.toString)
  println(p2.toString)
}