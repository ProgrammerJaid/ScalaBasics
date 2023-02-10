

object HelloWorld {
  def main(args: Array[String]): Unit = {
    
//    helloWorld();
//    basicControl();  
    
//    var res = higherOrderFunction(10,20,(x,y)=> x+y );
//    var res1 = higherOrderFunction(20, 30, (x,y)=> x min y);
//    println(res+" "+res1);
//    var res2 = higherOrderFunction1(15, 20, 30, (x,y)=>x+y);
//    println(res2)
    
    curryingFunction();
    
  }

  def basicControl() = {
    
    var x = 0;
    while(x<10){
      println(s"Hello World $x");
      x+=1;
    }
    
    for( a <-1 to 10)    //for(a<- 1.to(5))  another way of doing the same thing.
      println(a);
    
    for(i<-1 to 5;j<- 1 to 3)
      println(i+" "+j);
    
//    val lst = List(1,2,3,7,10,98,9);
//    
//    for(i<-lst;if i< 10)    //giving filter condition
//      println(i);
//    
//    var result=for(i<-lst; if i<10) yield  i*i;    //filtering and transforming
    
//    println(result);
    
    var age = 100;
    
    age match{
      case 20 => println(age);
      case 18 => println(age);
      case 24 => println(age);
      case _ => println("Default No Match");
    }
   
  }

  def helloWorld() = {
    
    var name = "Jaid";
    var age=18;
    println("Hello World");
    println(s"$name age is $age.");
    println(f"$name%s age is $age%d.");    //provides compile time safety
    println("Hello \nWorld");
    println(raw"Hello \nWorld.");
  }
  
  def higherOrderFunction(x:Double,y:Double,f: (Double,Double)=>Double):Double = f(x,y)

  def higherOrderFunction1(x: Int, y: Int, z: Int, f: (Int,Int) => Int) = f(f(x,y),z)

  def curryingFunction() = {
    def add(x:Int, y:Int) = x + y
    def add2 (x : Int) = (y : Int) => x + y;  
    def add3 (x :Int) (y : Int) = x +y ;
    
    println(add(20, 10));    
    println(add2(20)(10));
    val sum40 = add2(40);
    println(sum40(50));
    println(add3(100)(200));
    val sum50 = add3(50)_;
    println(sum50(400));
  }
}