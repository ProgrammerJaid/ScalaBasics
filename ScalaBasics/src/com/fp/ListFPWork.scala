package com.fp

object ListFPWork {
  
  def main(args: Array[String]): Unit = {
//    println(listReplication(4,List(1,2,3)))
//    println(filterOddPos(List(1,2,3,4,5,6,7,8)))
//    println(reverseList(List(1,2,3,4,5,6,7,8,9)))
//    println(getOnlyEleWhoseCountGreaterThanOrEqualToK(List(11,1,2,1,1,11,12,10,11,4,5),3))
//    println(getUniqueCharaInString("aaabbbbbbccccccddddddd"))
//    combinelettersInStrng()
//    printWithEvenCharacReversed("abcd")    //o/p:badc
    printStringCompression("abcaaabbb")      //o/p:abca3b3
    printPrefixCompression("abcdefpr","abcpqr")
  }
  
  def getOnlyEleWhoseCountGreaterThanOrEqualToK(xs:List[Int],k:Int):List[Int]={
    val ok = xs.groupBy(x => x)
              .mapValues(_.length >= k)
                .filter(_._2).keys
                  .toSet
       xs.filter(ok).distinct
  }
  
  def reverseList(lst:List[Int]):List[Int] = {
    
    return List.empty
  }
  
  def g(n:Int) = List(n-1,n+1)

  def listReplication(num: Int, lst: List[Int]):List[Int] = {
    val arr:List[Int]=lst.map ( x => List.fill(num)(x)).flatten
    println(arr)
    
    println("-------------------")
    println(lst.flatMap(x=> g(x)))
    println("-------------------")
    
    lst.flatMap(n=>List.fill(num)(n))
  }

  def filterOddPos(lst: List[Int]) = {
    val data = lst.zipWithIndex    //this merges it into Tuple2(val,pos)
    println(data)
    
    lst.zipWithIndex.filter(n => n._2%2!=0).map(_._1).toList
    
    //get sum of all odd elements
    
  }

  def getUniqueCharaInString(s: String):String = {
      val res = s.foldLeft("")((acc,x) =>{ 
              if(!acc.contains(x))  s"$acc$x" 
              else  acc
            })
            
      return res
  }

  def combinelettersInStrng() = {
    val x = "puppy"
    val y = "tuffy"
    val z = x.zip(y).map(m=>m._1.toString()+m._2.toString()).mkString("")
    val n = x.zip(y).flatMap(m=>m._1.toString()+m._2.toString()).mkString("")
    println(z==n)
  }

  def printWithEvenCharacReversed(s: String) = {
    
    //using sliding
    val res = s.sliding(2, 2)
      .toList.flatMap(_.reverse)
      .mkString("")
      
    println(res)
    
    val res1 = s.grouped(2).toList.map(_.reverse).mkString("")
    println(res1)
  }

  def printStringCompression(s: String) = {
      val inter = s.
                    foldRight(Seq.empty[(Char, Int)])((ch, acc)=>
                       if(!acc.isEmpty && acc.head._1 == ch) (ch, acc.head._2 + 1) +: acc.tail
                       else (ch,1) +: acc)
      println(inter)
      
      println(inter.foldLeft("")((acc, el) =>
                  if(el._2 == 1) acc + el._1
                  else acc + el._1 + el._2))
  }

  def printPrefixCompression(s1: String, s2: String) = {
    println(s1.zip(s2))
  }
  
}