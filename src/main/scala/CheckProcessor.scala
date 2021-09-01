/*Open/Closed Principle*/

case class Check(id:Int,bankName:String,bankAmount:Double)
class CheckProcessor {
  val checkList:List[Check] = List(Check(id=1, bankName="Bank of India", bankAmount = 5000.13))
  def checkProcessor:Unit = for(check<-checkList){
    if(check.bankName=="Bank of India"){
      sendMessage
    }
    else {
      println("Enter Correct Bank Name")
    }
  }
  def sendMessage:Unit={
    println("This is Bank of India.")
  }
}
object OCP extends App{
  val obj = new CheckProcessor
  obj.checkProcessor
}