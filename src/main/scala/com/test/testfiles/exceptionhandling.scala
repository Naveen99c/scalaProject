package com.test.testfiles
class StockNotAvaiable(s:String) extends Exception(s){}

class Products{
  var name:String=_
  var price:Float=_
  var stock:Int=_
  def this(n:String,p:Float,s:Int){
    this()
    this.name=n
    this.price=p
    this.stock=s
  }
  def isAvailable(quantity:Int): Boolean ={
      if (stock == 0) {
        throw new StockNotAvaiable(s"$name out of Stock")
      }
      else if (stock < quantity) {
        throw new StockNotAvaiable(s"Not enough $name! Quantity available:$stock")
      }
      else {
        true
      }
  }
}
class Customer{
  var id:Int=_
  var name:String=_
  var phone:String=_
  def this(name:String,phone:String){
    this()
    this.id=Customer.generateCustId()
    this.name=name
    this.phone=phone
  }
  def Buy(product:Products,quantity:Int): Unit = Shop.sell(this,product,quantity)

  override def toString: String = {
    super.toString()
    id+","+name+","+phone
  }
}
object Customer{
  var counter=100
  def generateCustId():Int={
    counter+=1
    counter
  }
}
object Shop{
  def sell(cus:Customer,prod:Products,quantity:Int): Unit ={
    try {
      if (prod.isAvailable(quantity)) {
        prod.stock -= quantity
        println(s"$quantity ${prod.name} sold to Customer:${cus.id} for Rs.${prod.price * quantity}")
      }
    }
    catch {
      case e:StockNotAvaiable => println(s"Sorry customer:${cus.id},${e.getMessage}")
    }
  }
}
object exceptionhandling {
  def main(args:Array[String]): Unit ={
    val prod=new Products("T-shirt",1,4)
    val cus1=new Customer("naveen","8667366744")
    val cus2=new Customer("suresh","8122164989")
    val cus3=new Customer("chandru","9841367053")
    print(cus1.toString)
    cus1.Buy(prod,3)
    cus2.Buy(prod,2)
    cus3.Buy(prod,2)
  }

}
