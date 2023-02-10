package com.oop

object OptionsEx {

//  trait Option[+A] {
//
//    def map[B](f: A => B): Option[B]
//    def flatMap[B](f: A => Option[B]): Option[B]
//    def getOrElse[B >: A](default: => B): B
//    def orElse[B >: A](ob: => Option[B]): Option[B]
//    def filter(f: A => Boolean): Option[A]
//
//  }
  
  case class Employee(name:String, department:String)
  
  val empByName = List(Employee("JJ","R&D"), Employee("Jaid","Acc")).map(e=>(e.name,e)).toMap

  def main(args: Array[String]): Unit = {
        
//    for( i <- empByName)
//      println(i+"-")
    val res = variance(Seq(3.0,5.0,8.0,1.0))    //ans = 6.68
    println(res)
  }

  def mean(xs: Seq[Double]): Option[Double] =
    if(xs.isEmpty) None
    else Some(xs.sum / xs.length)

  def variance(xs: Seq[Double]): Option[Double] =
    mean(xs).flatMap(m => mean(xs.map(x => math.pow(x - m, 2))))
}