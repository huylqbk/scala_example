
//basic  syntax class
//val is immutable, var is mutable
class Point(val xc: Int, val yc: Int) {
  //contructor
  var x :Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x+ dx
    y = y +dy
    println(x,y)
  }

  override def toString: String = s"($x,$y)"
}

//extending a class

class Point3(override val xc:Int, override val yc:Int, zc:Int) extends Point(xc,yc) {
  var z: Int = zc
  def move(dx:Int, dy:Int, dz:Int): Unit = {
    x = dx+x
    y = dy +y
    z = dz +z

    println(x,y,z)
  }
}

object test_class extends App {
  val pt = new Point(1,2)
  pt.move(2,1)
  println(pt.toString)

  val pt3 = new Point3(1,2,3)
  pt3.move(3,2)
  pt3.move(3,2,1)
}
