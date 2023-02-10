package com.devinsideyou

object CustomTuple extends Product3[String,Int,Boolean] {
  def _1: String = {
    "favourite number"
  }

  def _2: Int = {
    1337
  }

  def _3: Boolean = {
    true
  }

  def canEqual(that: Any): Boolean = {
    that.isInstanceOf[CustomTuple.type]
  }
}

class CustomClassTuple(favNo:String,no:Int,isEven:Boolean) extends 
                Product3[String,Int,Boolean]{
    def _1: String = favNo

  def _2: Int = no

  def _3: Boolean = isEven

  def canEqual(that: Any): Boolean = {
    that.isInstanceOf[CustomTuple.type]
  }
}