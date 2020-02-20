
trait Speaker {
  def speak():String

  //use as abstract
  def eat():Unit = println("eat done")
}
//use as interface
trait Wagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait Runner {
  def startRunning(): Unit
  def stopRunning(): Unit
}

class Dog extends Speaker with Wagger with Runner {
  def speak(): String = "gugu"
  def startTail(): Unit = println("start_tail")
  def stopTail():Unit = println("stop_tail")
  def startRunning():Unit = println("start_running")
  def stopRunning():Unit = println("stop_running")
}

class Cat extends Speaker {
  def speak(): String = "meomeo"

  override def eat(): Unit = println("cat eat done")
}

object _trait  extends App {
  val d = new Dog
  println(d.speak())
  d.startTail()
  d.startRunning()
  d.stopRunning()
  d.stopTail()

  //abstract
  d.eat()

  val c = new Cat
  c.eat()
}
