

class Assignment5_2 {


  def last[Int](list: List[Int]): Int = {
    list.foldLeft[Int](list.head){ (_, cur) => cur }
  }
}
val obj=new Assignment5_2()

println(obj.last(List(1, 1, 2, 3, 5, 8)))
  