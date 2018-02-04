package hello.Lesson23_trait_adv

/**
  * 关于scala中的多态
  *
  * 若class 继承了 trait的父类
  * class可以在创建的时候，使用with 来指定实例化对象：1、父trait 2、所有子trait
  */
class polymorphic {

}

trait Logged{
  def log(msg:String){}
}

trait MyLogger extends Logged{
  override def log(msg: String) = {
    println(msg)
  }
}

class HelloEngin extends Logged{
  def sayHello(name:String): Unit ={
    println("Hello, "+name)
    log("sayHello is invoked!!!")
  }
}




