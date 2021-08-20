package Q1and2

class Rational (n:Int,d:Int){
  require(d>0,"d must be greater than 0")
  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  def this(n:Int)=this(n,1)


  private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)
  def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg


  override def toString=s"${numer}/${denom}"
}
