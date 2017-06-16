import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

def RunningTaskAndBlockingIt {
  def sleep(time: Long) { Thread.sleep(time) }
  // Create Future
  val function = Future {
    sleep(5000)
    35 + 53
  }
  // Await.result: wait for up to 10 seconds
  // If not finished in 10 seconds, will return error
  val result = Await.result(function, 10 second)
  println(result)
  // Program will keep running while future is being calculated
  sleep(10000)
}

RunningTaskAndBlockingIt

import scala.util.{Failure, Success}
import scala.util.Random

def onComplete {
  def sleep(time: Long) { Thread.sleep(time) }
  val future = Future {
    sleep(Random.nextInt(1000))
    1 + 1
  }
  future.onComplete {
    case Success(value) => println(s"The value is = $value")
    case Failure(e) => e.printStackTrace()
  }

  println("1 ..."); sleep(150)
  println("2 ..."); sleep(150)
  println("3 ..."); sleep(150)
  println("4 ..."); sleep(150)
  sleep(2000)
}

onComplete

def returnAFuture {
  def sleep(time: Long) { Thread.sleep(time) }
  def longRunningComputation: Future[Int] = Future {
    sleep(100)
    1 + 1
  }

  longRunningComputation
}
















