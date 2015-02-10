package com.github.tamaki.study.perry

/**
 * Created by shoichiro.kanzaki on 15/02/10.
 */
class FizzBuzz {

}

object FizzBuzz{

  def toFizzBuzz(n: Int): String = n match {
    case i if i % 15 == 0 => "FizzBuzz"
    case i if i % 5 == 0 => "Fizz"
    case i if i % 3 == 0 => "Buzz"
    case i => i.toString
  }

  def main(args: Array[String]): Unit = {
    (1 to 100).map(toFizzBuzz).foreach(println)
  }
}