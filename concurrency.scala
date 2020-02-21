import java.util.concurrent.{ExecutorService, Executors}

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration._



object concurrency extends App {
  val thread = new Thread(new Runnable {
    def run() = println("abc")
  })

  thread.start()

  //Future as actor model programming
  val singleThread: ExecutorService = Executors.newSingleThreadExecutor()
  implicit val ec = ExecutionContext.fromExecutor(singleThread)
  val l = Future {
    val result = 12
    println("hello", result)
    result
  }

  l.map(r=>println("done", r))

  Await.result(l, 10.seconds)

  val l1 = Future {
    val value = 2
    println("l1")
    value
  }
  val l2 = Future {
    val value = 3
    println("l2")
    value
  }
  for {
    f1<-l1
    f2<-l2
  } yield println(f1+f2)

//  System.exit(0)
}
