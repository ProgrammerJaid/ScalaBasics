

object PatternMatching extends App {
  
  //switch expression
  val x = 55
  val order = x match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => x+"th"
  }
  
  println(order)
  
  //PM(Pattern Matching) is an expression.
  //PM can also deconstruct data structure into its constituent part
  
  case class Person(name:String, age:Int)
  val jaid =  Person("Jaid",25)
  
  //Deconstructing case classes
  val personGreeting = jaid match {
    case Person(n,a) => s"Hi my name is $n and I am $a years old"
    case _ => "Wrong Person"
  }
  
  println(personGreeting)
  
  //deconstructing Tuples
  val tup = ("Jaid","Sk")
  val title = tup match {
    case (fName,title) => s"My title is $title and name is #fName"
    case _ => "You don't have any title"
  }
  
  //decomposing lists
//  val lst = List(1,2,3)
//  val chk = lst match {
//    case List(_,2,_) => "List contains 2 at middle"
//    case _ => "List cannot be identified"
//  }
  
  //MatchError is thrown if case _ => is not given
  //Pattern Matching will try all the cases in sequence
}