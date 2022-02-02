package com.test.testfiles

import java.io.FileWriter
import scala.collection.mutable
import scala.collection.mutable._
import scala.util.control.Breaks._
import scala.util.matching.Regex
import scala.io.StdIn._


object files {
  def main(args:Array[String]) {
    val mapIm = Map("Zash" -> 30,
      "Jhavesh" -> 20,
      "Charlie" -> 50)

    // Sort map value in ascending order
    val res =mapIm.toSeq.sortWith(_._1 > _._1).toMap
    println(res)
  }
}
