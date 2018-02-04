package hello.Lesson19_object

/**
  * Created by JACK on 2018/2/1.
  */

abstract class Hello{
  def sayHello(name:String)
}

//继承抽象类，来实现抽象方法
object object_abstract extends Hello{

  override def sayHello(name: String): Unit = {
    println(name+",I love you so much")
  }
}

//object_abstract.sayHello("Jane")

