//implement stack
import scala.collection.mutable.Stack
object test {
  def main(args: Array[String]):Unit= {

    val s = Stack[Int]()
    s.push(5)
    s.push(1)
    s.push(2)
    println("s:" + s)
    val s2 = Stack[Int]()

    // pushing multiple values
    s2.push(5,1,2)
    println("s2:" + s2)

    println("Popped:" + s.pop)
    println("Popped:" + s.pop)
    println("Popped:" + s.pop)
    println("Empty:" + s.isEmpty)
  } }