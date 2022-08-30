package playground

import scala.io.StdIn

import scala.util.control.Breaks._

object FibonanceSeries extends App {
  
  var zulu: Int= 0
  var alpha : Int= 1
  var store : Int = 0
  
  
  println("Enter a number to print Fibo-series:")
 
  var input_val = scala.io.StdIn.readLine()
  
  breakable{
  
  for(count <- 0 until input_val.toInt)
  {
    if(store <= input_val.toInt)
    {
      println(store)
      store = zulu + alpha
      zulu = alpha
      alpha = store
    }
    else{
      if(store == input_val.toInt)
      {break}
    }
     }
  }
}