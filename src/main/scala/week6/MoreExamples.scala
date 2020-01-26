package week6

import scala.io.Source

object MoreExamples {

  def main(args: Array[String]): Unit = {
    wordCode("Java")
  }

  // Phone keys have mnemonics assigned to them
  val mnemonics = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")


  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords")

  val words = in.getLines


  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ")

  /** Invert the mnem map to give a map from chars 'A'  ... 'Z' to '2' ... '9' */
  val charCode: Map[Char, Char] =
    for((digit, str) <- mnem; ltr <- str) yield ltr -> digit


  /** Maps a word to the digit string it string can represent, e.g.  "Java" -> "5282"   */
  def wordCode(word: String):String =
    word map charCode




}

