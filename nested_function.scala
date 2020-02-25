object nested_function extends App{
  def func() ={
    var i = 2
    def nestedFunc = {
      println("print", i)
    }
    nestedFunc
    nestedFunc
  }
  func()
}
