object Assign5_2_1 {
  def sumConditional(map: Map[String, Int], str: String): Int = {
    var c=0
    for(value<-map.values){
      if(map.keysIterator.exists(_.contains(str)))
        c=c+value
    }
    c
  }

  def main(args: Array[String]) :Unit={
    val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
    val str = "anu"
    println(sumConditional(map, str))

  }
}
