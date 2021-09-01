
trait DoorService{
  def isOpen(a:Boolean)=true
  def open:Unit={
    println("Opening the Door")
  }
  def close:Unit={
    println("Closing the Door")
  }
}
trait TimedDoorService{
  def ClosedInSomeTime(duration:Int):Unit ={
    println(s"Door will close in $duration minutes.")
  }
}
class Door extends DoorService with TimedDoorService {
  override def isOpen(a: Boolean): Boolean = super.isOpen(a)
  override def open: Unit = super.open

  override def close: Unit = super.close
  override def ClosedInSomeTime(duration: Int):Unit={
    if(isOpen(true)){
      println(s"Door will automatically close in $duration minutes.")
    }
  }
}

object ISP extends App{
  val checkOpen = new Door
  checkOpen.isOpen(true)
  checkOpen.ClosedInSomeTime(duration = 2)
}