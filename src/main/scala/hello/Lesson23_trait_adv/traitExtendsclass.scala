package hello.Lesson23_trait_adv

/**
  * trait 继承 class 可以使用父类方法
  * 当类继承trait（继承了class的trait），则class将成为他们的父类
  */
class traitExtendsclass {}

class MyUtil{
  def printMessage(msg:String)=println(msg)
}

trait Loggerx extends MyUtil{
  def log(msg: String): Unit = printMessage("Logger==>"+msg)
}

class Personx extends Loggerx{
  def sayHello(msg:String): Unit ={
    printMessage(msg);
    log(msg)
  }
}