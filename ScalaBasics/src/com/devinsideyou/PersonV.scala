package com.devinsideyou

final case class PersonV(name:String,age:Int,isMale:Boolean){
  def isFemale:Boolean = !isMale
}