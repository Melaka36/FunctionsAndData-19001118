package Q3

object transfer extends App {
  val a1 = new Account("989999999v", 1340000, 5000.54)
  val a2 = new Account("345758777v",560000,2000.00)
  a1.transfer(a2,1000.00)
  println(a1)
  println(a2)
}
