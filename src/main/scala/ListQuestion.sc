//- Find the last element of list with its index value(dont use inbuilt methods to extract last element directly)
//- print the table of each element in the List
//- aggregate the contents of two lists of same size into a single list
//List(1,2) and List("a", "b") results List(List(1, "a"), List(2, "b"))
//- find sum and multiplication of the list (dont use inbuilt methods)
class ListQuestion {

  def lastelement[Int](list: List[Int]): Int = {
    list.foldLeft[Int](list.head) { (_, cur) => cur }
  }

  def table(list: List[Int]): Unit = {
    for (i <- 0 to list.length) {
      val c = list(i)
      var j: Int = 0
      while (j <= 10) {
        println(j * c + " ")
      }
    }
  }
  def sum(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + sum(tail) // if there is an element, add it to the sum of the tail
      case Nil => 0 // if there are no elements, then the sum is 0
    }
  }
  def multiply(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + multiply(tail) // if there is an element, add it to the sum of the tail
      case Nil => 0 // if there are no elements, then the sum is 0
    }
  }
}
val obj=new ListQuestion()
println(obj.lastelement(List(1,2,3,4,5)))
println(obj.sum(List(2,3,4,5,6)))
println(obj.multiply(List(2,3,4,5,6)))