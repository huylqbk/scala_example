
object call_by_name extends App {
  //call by value
  def callByValue(i:Int) = {
    println("line 1",i)
    println("line 2", i)
  }

  var total = 0
  callByValue{
     total+=1;total
  }

  def callByName(i: =>Int) {
    println("line 1", i)
    println("line 2", i)
  }

  total=0
  callByName{
    total+=1;total
  }

}
