package com.fp

object PartiallyAppliedFunctions {
  
  def increement(x:Int):Int = x+1
  val increementFunction = (x:Int) => x+1
  
  //Eta's expansion: conversion of method to function
  //val increeFnc = increement  //we cannot say it this will give compile error
  
  val increeFnc = increement _  //the _ signifies conversion of method to function called eta expansion
  val increeFnc2:Int=>Int = increement  //auto eta expansion due to type defined in val
  List(1,2,3).map(increement)  //method auto converted to func as map(function)
    
  def main(args: Array[String]): Unit = {
    
//    val three = increementFunction(2)
//    println(three)
    
//    partiallyAppliedFnc()
   
  }
  
  def partiallyAppliedFnc():Unit = {
    
    def multiArgsAdder(x:Int)(y:Int) = x+y    //Generalized function
    val add2 = multiArgsAdder(2)_    //eta expansion eqtn becomes y=2+y creatng unique fnc by fxing params
    
    val res = add2(1)
    println(res)
    
    def threeArgsAdder(x:Int)(y:Int)(z:Int) = x+y+z
    val twoArgsAdder = threeArgsAdder(10)_    // y => z = 10+y+z
    val singleArgsAdder = threeArgsAdder(10)(20)_  //z = 10+20+z 
    
  }
  
}