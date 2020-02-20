import scala.collection.mutable.ArrayBuffer

object collections extends App{

  //Array
  //init
  val num = ArrayBuffer(1,2,3)
  //add one
  num +=4
  //add from list
  num ++= List(5,6,7)
  //clear all
  num -= 0

  num.append(8)
  num.append(5)
  num.insert(5,5)
  num.remove(0)
  num.trimStart(1)

  //linked list
  val list = List(1,2,3)

  //vector is immutable and indexed
  val vector = Vector(1,2,3)

  println(num)
  println(list)
  println(vector)


  var map = Map(
    1->"A",
    2->"B",
    3->"c"
  )

  map += (4->"D")
  println(map)

  for ((k,v)<-map) {
    println(k,v)
  }

  map.foreach {
    case (k,v) => println(k,v)
  }

  val set:Set[Int] = Set(1,2,3,1,2,3)
  println(set)

}
