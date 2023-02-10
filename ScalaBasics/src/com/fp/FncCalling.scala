package com.fp

import scala.util.Try
import scala.concurrent.Future

/*
 * About call by value and call by reference
 */

object FncCalling {

  def callByValue(i: Int) = {
    println("X deposited" + i)
    println("X deposited" + i)
    println("X deposited" + i)
    println("X deposited" + i)
  }

  def callByName(i: => Int) = {
    println("Y deposited" + i)
    println("Y deposited" + i)
    println("Y deposited" + i)
    println("Y deposited" + i)
  }
  
  // Use of byName(: =>)
  // trick 1=re-evaluation
  
  def byValue(x: Long)={
    println(x)
    println(x)
  }
  
  def byName(x: =>Long)={
    println(x)
    println(x)
  }

  // trick 2 = call by need pattern
  abstract class MyList[+T] {
    def head: T
    def tail: MyList[T]
  }
  
  //infinite collections: LazyList(2.13) onwards
  class MyLstImpl[+T](h: =>T, t: =>MyList[T]) extends MyList[T] {
    
    override lazy val head = h
    override lazy val tail = t
    
  }
  
  // trick 3 = hold the door
  val anAttempt: Try[Int] = Try(throw new NullPointerException)
  
  import scala.concurrent.ExecutionContext.Implicits.global
  val afuture = Future{
    42
  }
  
  def main(args: Array[String]): Unit = {

//    var amount = 0
//    callByValue{amount+=1;amount}    //amount +=1 is evaluated once and then sent to function
//    
//    amount=0
//    println("---------------------\n")
//    callByName{amount+=1;amount}    //amount+=1 is evaluated every time the value i in fnc is used
    
    byName(System.nanoTime())
    println("-----")
    byValue(System.nanoTime())
    
  }

}