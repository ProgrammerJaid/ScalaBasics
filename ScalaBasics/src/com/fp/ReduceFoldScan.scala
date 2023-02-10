package com.fp

object ReduceFoldScan {
  val lst1 = List(1,2,3,5,7,10,13)
  val lst2 = List("A","B","C")
  
  def main(args: Array[String]): Unit = {
    
//    reduceOP()
    foldOP()
//    scanOP()
  }
  
  def reduceOP():Unit = {
    
    //reduce reduceLeft reduceRight
    println(lst1.reduceLeft(_+_))
    println(lst1.reduceRight(_+_))
    println(lst1.reduceLeft((x,y) =>{
                 println(x+" , "+y);x+y}))
      
    println(lst2.reduceRight(_+_))
    println(lst2.reduceLeft(_+_))
    
    println(lst1.reduceLeft(_-_))
    println(lst1.reduceRight((x,y) =>{
      println(x+" , "+y); x-y}))
    println(lst1.reduceRight(_-_))
    println(lst1.reduce(_+_))
    
  }

  def foldOP() = {
    
    //fold foldLeft foldRight
    println(lst1.foldLeft(0)(_+_))
    println(lst2.foldLeft("")(_+_))
    
    println(lst2.foldRight("XYZ")(_+_))
    
    println(lst1.fold(10)((x,y)=> x+y))
    
    //print length of lst 
    println("length ="+lst1.foldLeft(0)((x,_)=>x+1))
  }
  
  def scanOP():Unit = {
    
    println(lst1.scanLeft(0)(_+_))
    
  }
}