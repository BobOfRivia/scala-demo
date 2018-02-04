package hello.Lesson18_obj

/**
  * 内部类
  * 重要
  * 与JAVA不同的是，每个外部类对象的内部类，都是不同的对象
  * 不可相互转化
  *
  * Demo有问题!!
  *
  */

import scala.collection.mutable.ArrayBuffer
class Class {

  class Student(name:String) {}

  val students = new ArrayBuffer[Student]

  def getStudent(name:String) ={
    new Student(name)
  }
}

object test6{

  def main(args: Array[String]): Unit = {

    var clazz1 = new Class
    var st1 = clazz1.getStudent("bob")
//    clazz1.students += st1

    var clazz2 = new Class
    var st2 = clazz2.getStudent("jack")

//    clazz1.students += st2

  }

}

