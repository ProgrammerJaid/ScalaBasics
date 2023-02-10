

package com.fp

object RangeFnc {
  
  def main(args: Array[String]): Unit = {
    rangeWk()
  }
  
  def rangeWk() = {
    
    val r1 = Range(1,10)
    println(r1)
    
    val r2 = Range.inclusive(1,10)
    println(r2)
    
    // range with steps
    val odd = 1 to 100 by 2
    println(odd)
    
    val even = Range.inclusive(0, 100, 2)
    println(even)
    
    //range to list
    val lst = even.toList
    println(lst)
    
    //with bigdecimal
    val decimalRange = BigDecimal(1.0) to BigDecimal(2.0) by 0.2
    println(decimalRange.toList)
    
    println(r1.filter(_%2==0))
  }
}