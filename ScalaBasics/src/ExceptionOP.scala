

object ExceptionOP extends App {
  def failingFn(i: Int): Int = {
    val x: Int = throw new Exception("fail!")
    try {
      val y = 42 + 5
      x + y
    } catch { case e: Exception => 43 }
  }
  
//  failingFn(10)
  
  def options():Unit = {
    
    val anOp: Option[Int] = Option(42)  // Some(42)
    val anOp1 = Some(42)
    val anEmptyOp = Option.empty  //None
    
    val aTransformOp = anOp.map(_*10)
    
    if(!aTransformOp.isEmpty)
      println(aTransformOp+"---"+aTransformOp.get)
    
//    Option chaining 
    val aChainedOp = anEmptyOp.orElse(anOp)
//    Option describes the possible absence of value
    
    def unSafeMethod(arg: Int):String = null
    
//    in the above method me as a user needs to defend myself from null pointer exception
    val res = unSafeMethod(10)
    if(res==null)  println("ERROR")    
    else  res.toUpperCase()
    
//    using option
    val resOp = for{
      value <- Option(unSafeMethod(22))
    } yield value.toUpperCase()
    
    println("With opton result "+resOp)
    
    
  }
  
  options()
}