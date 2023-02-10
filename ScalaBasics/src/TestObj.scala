object TestObj {
  
  def main(args: Array[String]): Unit = {
    
    val lst = List(10,4)
    val y = 4
    
    val x =  if(lst(0)==y)  lst(1)  else    lst(0)                       //get(lst,y)
    
    val res = Range.inclusive(1,4).filter(y%_==0).filter(x%_==0).toList
    println(res.length)
    
  }

  def get(lst: List[Int], y: Int):Int = {
    if(lst(0)==y)  lst(1)
    else    lst(0)
  }
  
}