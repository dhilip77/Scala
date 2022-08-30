package playground

import scala.annotation.tailrec

object Factorial extends App{
  
  println("Enter a number:")
  var number = scala.io.StdIn.readInt()
  println(s"myFact for ${number} is:" + factorial(number.toInt))
  
  def factorial(number: Int): BigInt={
    //println("inside fact")
    @tailrec
    def helper(count: Int, acc: Int): BigInt ={
       println(acc)

      if ( count <= 1){
        return acc
      }
      else{
        return helper((count -1), (count * acc))
      }

      }
      return helper(number, 1)
      
  }
  

  
 
 
}