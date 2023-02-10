

package com.fp

object FunctionsWorking extends App {

  case class Player(name: String, x: Int)

  def winner(x1: Player, x2: Player): Player =
    if (x1.x > x2.x) x1 else x2

  def declareWinner(p1: Player, p2: Player): Unit =
    printWinner(winner(p1, p2))

  def printWinner(p: Player): Unit =
    println(p.name + " is the winner!")

  val players = List(
    Player("Sue", 7),
    Player("Bob", 8),
    Player("Joe", 4))
  val p = players.reduceLeft(winner)
  printWinner(p)
}