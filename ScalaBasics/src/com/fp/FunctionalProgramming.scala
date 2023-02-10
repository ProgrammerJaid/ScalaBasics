

package com.fp

import scala.Vector
import scala.collection.Seq

object FunctionalProgramming {
  
  def main(args: Array[String]): Unit = {
    maps();
//    filters();
//    collections()
  }
  
  def maps():Unit ={
    
//    FlatMap functioning
    val names = Seq("SK","Jaid");
    val ext = names.map(n=>n.toLowerCase());
    val res1 = ext.flatten
    println(ext+"---"+res1)
    val fmap = names.flatMap(_.toLowerCase());  //flat map is map+flatten
    println(s"--$fmap")
    
    //working higher order function
    val myList = List(1,2,3)
    def f(x:Int) = List(x-1,x,x+1)
    
    val lst = myList.flatMap(y=>f(y))
    println(lst)
    
    // Creating a sequence of numbers
    val seq = Seq(8, 15, 22, 23, 24)
  
    // Applying flatMap on if-else statement
    val result = seq flatMap(s=> if(s%3==0)  Seq(s) 
                                     else   Seq(-s))
  
    // Displays output
    println(result)
    
  }

  def filters() = {
    
    val filteredList = List(1,2,3,4,5).filter(x => x<=3)
    println(filteredList)
    
    val syntaxSugar = List(1,2,3,4,5).filter(_<=3)
    println(syntaxSugar)
    
    // all combination of 1,2,3 and a,b,c
    val allPairs = List(1,2,3)
          .flatMap(x => List('a','b','c')
                      .map(letter => s"$x-$letter"))
                      
    println(allPairs)
    
    //for comprehension syntax sugar of above code
    
    val alternative = for{
      no <-List(1,2,3)
      letter <-List('a','b','c')
    } yield s"$no-$letter"
    
    println(alternative)
  }
  
  def collections():Unit = {
    
    val list = List(1,2,3,4,5)
    val firstEle = list.head
    val restEle = list.tail
    val aPrependedList = 0 :: list
    val anExtenList = 0 +: list :+ 6
    
    println(anExtenList)
    
    //Sequences
    val aSeq = Seq(1,2,3)  //Seq is a trait main feature is random access
    val randomAcess = aSeq(1) //gives 2
    println(randomAcess)
    
    //a sequence very fast for large data is vector 
    val aVector = Vector(1,2,3,4,5)
    
    //sets
    val aSet = Set(1,2,4,4,5)
    val check = aSet(5)
    println(check)
    
    //add element or remove element from set
    val nSet = aSet-5
    val ch = nSet(5)
    println(ch)
    
    val nSet1 = nSet+3
    println(nSet1)
    
    
    //ranges
    val aRange = 1 to 1000  //does not contain 1 to 1000
    val twoByTwo = aRange.map(2*_).toList
    println(twoByTwo)
  }
  
  
}