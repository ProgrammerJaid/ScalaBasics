
import Array._
import com.oop.List

object DataStructures {

  val myArr: Array[Int] = new Array[Int](2);
  val myArr1 = new Array[Int](10);
  def main(args: Array[String]): Unit = {

//    arraysDemo();
    listDemo();
  }

  def arraysDemo() = {
    myArr(0) = 10;
    for (i <- myArr)
      println(i);

    var res = concat(myArr, myArr1);
    println(res.length)
    for (i <- res)
      println(i)
  }

  def listDemo() = {
    val myList : List[Int] = List(1,2,3,4,5,6,7,8,9);
    ///TODO ::: .::: :+ +: ++
    
    println(myList)  //creates a new list and prints it
    
  }

}