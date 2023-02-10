



package com.oop

object ObjectOrientation extends App {
  
  class Animal{
    
    val age: Int = 0
    
    def eat() = println("I m eating");
    
  }
  
  class Point(x:Int,y:Int){
    override def toString():String = "("+ x + ", " + y + ")"
  }
  
  class Point1(var x:Int,var y:Int){
    override def toString():String = "("+ x + ", " + y + ")"
  }
  
   val p = new Point(2,3)
//    p.x=10    //this will not work bcoz
    val p0 = new Point1(2,3)
    p0.x =10    //this will work bcoz we add var with constructor
  
  val anAnimal = new Animal
  
  //Inheritance
  class Dog(val name: String) extends Animal  //Constructor definition
  val aDog = new Dog("Dodo")
  
  //sub type polymorphism
  val aDeclaredAnimal: Animal = new Dog("Tomy");
  aDeclaredAnimal.eat()
  
  //abstract class
  abstract class WalkingAnimal {
    val hasLegs = true
    def walk(): Unit
  }
  
  //interface
  trait Carnivore{
    def eat(animal: Animal): Unit
  }
  
  class Crocodile extends Animal with Carnivore {
    def eat(animal: Animal): Unit = {
      println("Croc eats");
    }
  }
  
  //Anonymous classes
  val dinosaur = new Carnivore{
    override def eat(animal:Animal): Unit = 
            println("I can eat anyone.");
  }
  
  // singleton Object
  object MySingleton{  //the only instance of the MySingleton type
    val mySpcVal = 52345
    def mySpcMethod():Int = 5555
    def apply(x:Int):Int = x+1
  }
  
  MySingleton.apply(35)
  MySingleton(35)  //same as above apply method is special
}