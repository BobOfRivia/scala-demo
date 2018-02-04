package hello.Lesson21_extends

/**
  * Created by JACK on 2018/2/3.
  */
object testObject {


  def main(args: Array[String]): Unit = {
    println("==============TEST FOR constructorDemo==============")
    //TEST FOR constructorDemo
    var s0 = new Student3(12)
    println(s0)
    var s1 = new Student3("Jane")
    println(s1)
    var s2 = new Student3("Bob",32,"C")
    println(s2)

    println("==============Test For Anonymous==============")

    //Test For Anonymous
    //1、定义一个没有名称的子类，并将其赋值给一个变量
    val p = new PersonAnon("Lady"){
      override def sayHello: String = {
        "Hi, "+name + " I'm Anonymous！"
      }
    }
    p.sayHello
    //2、这个变量可以作为参数传递给其他函数
    def greeting(p:PersonAnon): Unit ={
      println(p.sayHello)
    }
    greeting(p)


    println("==============Test For AbstractClazz.scala==============")
//  Wrong 抽象类，无法被实例化  var s = new PersonAbs() {}
    var s = new StudentAbs("Jone")
    s.sayHello

  }

}
