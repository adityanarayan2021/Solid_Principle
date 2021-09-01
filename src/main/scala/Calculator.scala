/*Single Responsibility Principle*/
class Calculator {

  def Addition(firstNumber:Int,secondNumber:Int):Int={
    firstNumber+secondNumber
  }

  def Subtraction(firstNumber:Int,secondNumber:Int):Int={
    firstNumber-secondNumber
  }

  def Multiplication(firstNumber:Int,secondNumber:Int):Int={
    firstNumber*secondNumber
  }

  def Divide(firstNumber:Int,secondNumber:Int):Int={
    firstNumber/secondNumber
  }
}

object SRP extends App{
  val calculate = new Calculator()
  println("Addition of two numbers: "+calculate.Addition(20,10))
  println("Subtraction two numbers: "+calculate.Subtraction(50,35))
  println("Addition of two numbers: "+calculate.Multiplication(10,2))
  println("Addition of two numbers: "+calculate.Divide(50,5))
}