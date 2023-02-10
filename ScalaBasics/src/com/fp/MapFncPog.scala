package com.fp

object MapFncPog {

  case class Donut(name: String, price: Double)

  def main(args: Array[String]): Unit = {
    println("-" * 50)
    mapsDemo()
//    groupByFnc()
    println("-" * 50)
  }

  def groupByFnc() = {
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut", "Staw Donut")
    println(s"Elements of donuts = $donuts")
    val donutsGroup: Map[Char, Seq[String]] = donuts.groupBy(_.charAt(0))
    println(s"Group elements in the donut sequence by the first letter of the donut name:")
    println(donutsGroup)

    val donuts2: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
    println(s"Elements of donuts2 = $donuts2")
    val donutsByPrice: Map[Double, Seq[Donut]] = donuts2.groupBy(_.price)
    println(donutsByPrice)
  }

  def mapsDemo() = {
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    
    println(colors1++colors2)          //A union B (A U B)
    
    //check for key in map
    val safe:Option[String]=colors2.get("red")
    val notSafe:String = colors1("peru")    //this can throw exception
    if(!safe.isEmpty)
      println(notSafe+"---"+safe.get)
      
    //iterator 
    val itr = colors1.iterator
    while(itr.nonEmpty)
      println(itr.next())    //this is of type tuple
      
    println(colors1.drop(1))  //returns all element except first n ones,here n=1
    println(colors1.dropRight(1))  //returns all element except last n ones, here n =1
    println(colors1.dropWhile(z=>true))  //can be used to drop items for a predicate
    
  }

}