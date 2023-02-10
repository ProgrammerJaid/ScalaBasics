package com.fp

object Factorial {

  def fact(n: Int): Int = {
    if (n == 0) 1
    else n * fact(n - 1)
  }

  def main(args: Array[String]): Unit = {
//    println(fact(5))
//    println(factTailRecursion(5, 1))
//    fibonacci(10)
//    println(fibb(0, 1, 10))
//    val arr = Array(1,2,3,4,5,6,7,9)
//    val ind = binarySearch(arr, 9, (x:Int,y:Int)=>{
//      if(x>y)  true
//      else false
//      })
//      
//      println("The value at pos "+ind+" is "+arr(ind))
    
//    isSorted()
  }

  def factTailRecursion(x: Int, acc: Int): Int = {
    if (x == 0) acc;
    else factTailRecursion(x - 1, x * acc) //this is tail calls in scala and treated as
    //loop instead of storing it in call stack
  }

  def fibonacci(n: Int) = {
    var prev = 0
    var curr = 1
    for (i <- 1 to n - 1) {
      var tmp = curr + prev;
      prev = curr
      curr = tmp
      print(s"$tmp ")
    }
  }

  def fibb(first: Int, second: Int, n: Int): Int = {
    if (n <= 1) n
    else fibb(second, first + second, n - 1) + fibb(second, first + second, n - 2)
  }

  def binarySearch[A](as: Array[A], key: A, gt: (A, A) => Boolean): Int = {
    @annotation.tailrec
    def go(low: Int, mid: Int, high: Int): Int = {
      if (low > high) -mid - 1
      else {
        val mid2 = (low + high) / 2
        val a = as(mid2)
        val greater = gt(a, key)
        if (!greater && !gt(key, a)) mid2
        else if (greater) go(low, mid2, mid2 - 1)
        else go(mid2 + 1, mid2, high)
      }
    }
    
    go(0, 0, as.length - 1)
    
  }

  def isSorted[A](arr: Array[A], gt: (A, A) => Boolean):Boolean = {
    
    //TODO:
    
    true;
  }

}