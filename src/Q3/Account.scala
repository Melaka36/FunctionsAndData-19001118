package Q3

class Account(id:String, n:Int, b:Double){
  var nic:String = id
  var accNo:Int = n
  var balance:Double = b

  def withdraw(a:Double)={
    this.balance = this.balance - a
  }

  def deposit(a:Double)={
    this.balance = this.balance + a
  }
  def transfer(a:Account,b:Double)={
    this.withdraw(b)
    a.deposit(b)
  }
  override def toString = s"[${nic} : ${accNo} : ${balance}]"

}
