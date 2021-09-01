/*Liskov Substitution Principle*/
trait DogBehaviour{
  def run:Unit
}
class RealDog extends DogBehaviour {

  override def run:Unit={
    println("Real Dog Runs")
  }
}
class RoboDog extends DogBehaviour{
  val batteryCharge= true
  override def run:Unit={
    if(batteryCharge==true) println("Robo Dog Runs")
  }
}
object LSP extends App {
  val realDog = new RealDog
  realDog.run
  val roboDog = new RoboDog
  roboDog.run
}
