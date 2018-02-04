package hello.Lesson18_obj

import scala.beans.BeanProperty


class Student2(@BeanProperty var name:String)

class Student3{
  @BeanProperty var name:String=_
}


object test2{
  def main (args: Array[String] ): Unit = {
    var student = new Student2("Leo")
    println(student.getName)
  }

}

