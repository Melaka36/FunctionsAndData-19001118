package Q4

object Bank extends App {
  val a1 = new Account("100050000v",2424225,4000.00)
  val a2 = new Account("200050000v",4544546,7000.00)
  val a3 = new Account("300050000v",4645577,2000.00)
  val a4 = new Account("400050000v",2543768,-5000.00)
  val a5 = new Account("500050000v",4546675,3000.00)

  var bank:List[Account]=List(a1,a2,a3,a4,a5)

  val overdraft = (b:List[Account])=>b.filter(x=>x.balance<0)
  println(s"Negative accounts:- ${overdraft(bank)}")

  //Total balance
  val balance  = (b:List[Account])=>(b.map(x=>x.balance)).reduce((x,y)=>x+y)
  println(s"\nTotal of all account balances = ${balance(bank)}")

  val interest = (b:List[Account])=>b.map((x)=>(x.nic,x.accNo,if(x.balance > 0)(x.balance + (x.balance * 0.5))
  else (x.balance + (x.balance * 0.1))))
  println(s"\nFinal account balances :- ${interest(bank)}")
}
