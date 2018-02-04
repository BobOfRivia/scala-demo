package hello.Lesson21_extends

/**
  * 通过模式匹配来判断类型
  *
  * 匹配模式的规则，等同于asInstanceOf 父子类算作同一类
  *
  */
class caseToclass {

}
class Person{
  val name = "Jack"
}
class Student extends Person{
  val score = "A"
}

object test2{

  def main(args: Array[String]): Unit = {
    val p:Person=new Student
    p match {
      case per:Person => println("Hi,"+per.name)
      case _:Student => println("get score "+_)
    }

  }

}

