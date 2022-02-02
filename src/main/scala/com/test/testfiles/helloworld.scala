package com.test.testfiles
import scala.collection.mutable._
import scala.util.Random._
import scala.io.StdIn._
import scala.util.matching.Regex
import scala.util.control.Breaks._
import Array._
import scala.annotation.tailrec
import scala.collection.mutable._
import java.io._
import scala.io.Source
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.Date

/*
class Book(var id:String,var name:String,var a_name:String,var p_details:String,var p_date:Date){
  def returnDetails():String={
  s"$id,$name,$a_name,$p_details,${p_date.toString}\n"
  }
}
object Book{
  def storeBookInFile(books:ListBuffer[Book],filename:String="bookdetails.txt"): Unit ={
      var fw=new FileWriter(filename)
      for(book<-books) fw.write(book.returnDetails());
      fw.close()
  }
  def retriveFromFile(filename:String="bookdetails.txt"): Unit ={
    Source.fromFile(filename).foreach(print)
  }
}
object helloworld{
  def main(args:Array[String]): Unit ={
    print("Enter the number of books:")
    var n=readInt()
    var bookList:ListBuffer[Book]=ListBuffer()
    for(i<-1 to n){
      var id=""
      do{
        print("\nEnter book ID(AlphaNumeric):")
        id=readLine()
      }while(!id.matches("([a-z]|[A-Z]|[0-9])+"))

      print("\nEnter book name:")
      var name=readLine()
      print("\nEnter author name:")
      var a_name=readLine()
      print("\nEnter publication details:")
      var p_details=readLine()
      print("\nEnter publication date(DD/MM/YYYY):")
      var p_date=readLine()
      bookList+=new Book(id.toUpperCase,name.toUpperCase,a_name.toUpperCase,p_details,new Date(p_date))
    }
  }
}*/