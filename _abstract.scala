//use abstract when need create a contractor
abstract class Pet(name:String) {
  def speak():Unit = println(s"speak $name")
  def running():Unit
}

class Pig(name:String) extends Pet(name) {
  def running():Unit = println("RUN")
}

object _abstract extends App{
  var c = new Pig("heo")
  c.speak()
  c.running()
}
