package hello.Lesson21_extends

/**
  * Created by JACK on 2018/2/2.
  */
class protectedDemo {
}
class Person1{
  protected val action ="chat"
}
class Student1 extends Person1{
  var name = ""
  def makeFirends(s:Student1): Unit ={
    println("Hello,my name is "+s.name+" can we have a "+s.action)
  }
}

/**
  * 只有当前子类可以访问父类的 protected[this]元素
  */
class Person2{
  protected[this] val action ="chat"
}
class Student2 extends Person2{
  var name = ""
  def makeFirends(s:Student2): Unit ={

//    println("Hello,my name is "+s.name+" can we have a "+s.action)
  }
}

object test4{
  def main(args: Array[String]): Unit = {
    var s1 = new Student1
    var s2 = new Student1
    s1.makeFirends(s2)

  }


}

