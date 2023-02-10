package com.devinsideyou

object TestClass {
  def main(args: Array[String]): Unit = {
//    val t3 = CustomTuple
//    println(t3._2)
    
//    val ct3 = new CustomClassTuple("1111",121,false)
//    println(ct3._1)
    
    println("-" * 50)
    code()
    println("-" * 50)
  }

  def code() = {
    val kuila = PersonV("Kuila",22,true)
    println(kuila.productArity)
    println(kuila.productElement(0))
    println(kuila.productPrefix)
  }
}