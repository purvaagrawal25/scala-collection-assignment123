//implement queue
import scala.collection.mutable._
object queue
{
  def main(args:Array[String])
  {
    // Initialize a queue
    val q1 = Queue(1, 2, 3, 4, 5)
    print("Queue Elements: ")
    q1.foreach((element:Int) => print(element+" "))
    val firstElement = q1.front
    println("\nFirst element in the queue: "+ firstElement)
    q1.enqueue(10)
    print("Queue Elements after enqueue: ")
    q1.foreach((element:Int) => print(element+" "))
    val deq = q1.dequeue
    print("\nQueue Elements after dequeue: ")
    q1.foreach((element:Int) => print(element+" "))

    print("\nDequeued element: " + deq)
    println("\nQueue is empty: "+ q1.isEmpty)
  }
}
