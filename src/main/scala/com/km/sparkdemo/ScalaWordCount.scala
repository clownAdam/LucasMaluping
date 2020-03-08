package com.km.sparkdemo

import org.apache.spark.{SparkConf, SparkContext}


object ScalaWordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("wd")
    val sc = new SparkContext(conf)
    val lines = sc.textFile("/input")
    val resCount = lines.count()
    println(resCount)
  }
}
