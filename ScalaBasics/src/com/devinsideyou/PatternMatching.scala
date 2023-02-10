package com.devinsideyou

object PatternMatching {

  def main(args: Array[String]): Unit = {

    //    method(1)
    //    method(2)
    //    method("abc")
    //    method('c')

    //binding of names and guards
        val jj = new Person("Jaid", 17)
        method1(jj)

//    val someSms = SMS("12345", "Are you there?")
//    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
//
//    println(showNotification(someSms))
//
//    println(showNotification(someVoiceRecording))
//
//    patternGuards()

  }

  def method(n: Any): Unit = {
    val data = n match {
      case variable => ()
    }

    println(n + "--" + data)
  }

  def method1(p: Person): Unit = {
    val res = p match {
      case person @ Person(name:String,age@25) => "U r allowed"
      case person @ Person(name:String,age@17)
      if (age<=17)  => "U r kid"
      case _ => "Bhai ho gya"
    }
    println(res)
  }

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  def patternGuards() = {
    //Pattern guards are boolean expressions which are used to make cases more specific.
    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSms = SMS("123-4567", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))

    println(showImportantNotification(importantSms, importantPeopleInfo))
  }

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }

}

final case class Person(name: String, age: Int) {
  def isAdult: Boolean = age >= 18
}

sealed trait Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification