

object PatternMatching2 extends App {
  
  //Pattern matching on Seq
  
//  def seqToString[T](seq:Seq[T]):String =
//    seq match {
//    case head+:tail => s"($head +: ${seqToString(tail)})"
//    case _ => "Nil"
//  }
//  
//  val res = seqToString(Seq("Sk","jaid"))
//  println(res)
//  
//  val res1 = seqToString(Vector(1, 2, 3))
//  val res2 = seqToString(Vector.empty[Int])
//  
//  println(res1+"--"+res2)
//  
//  def reverseSeqToString[T](l:Seq[T]):String =
//    
//    l match {
//    case prefix :+ end => s"${reverseSeqToString(prefix)} :+ $end)"
//    case _ => "Nil"
//    }
//  
//  val revList1 = Seq.empty[Int] :+ 1 :+ 2 :+ 3 :+ 4 :+ 5
//  println(revList1)
  
  //Pattern matching on Repeated Parameters
//  def matchThree(seq: Seq[Int]) =
//    seq match {
//    case Seq(h1,h2,_*) => println(s"head 1 = $h1, head 2 = $h2, the rest = _*")
//    case _ => println(s"other! $seq")
//  }
//  
//  matchThree(Seq(1,2,3,4))
//  matchThree(Seq(1,2,3))
//  matchThree(Seq(1,2))
//  matchThree(Seq(1))
  
  //Matching On regex
  
  
}