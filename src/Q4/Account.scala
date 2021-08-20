package Q4

class Account(id:String, n:Int, b:Double){
    var nic:String = id
    var accNo:Int = n
    var balance:Double = b

    override def toString = s"[${nic} : ${accNo} : ${balance}]"
}

