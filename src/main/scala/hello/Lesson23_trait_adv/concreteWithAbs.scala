package hello.Lesson23_trait_adv

/**
  * 混合使用trait的具体方法和抽象方法
  * 可以让具体方法依赖于抽象方法
  * 通过实现类来实现抽象方法
  *
  * 采用设计模式中：模板设计模式
  *
  */
class concreteWithAbs {}

trait WakeEngin1{
  def getTime:String
  def sayHello(): Unit ={
    println("Now Time is:"+getTime+" chop,chop,get up!!!")
  }
}

class Waker(time:String) extends WakeEngin1{
  def getTime:String={
    time
  }
}


