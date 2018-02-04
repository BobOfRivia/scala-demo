package hello.Lesson22_trait

/**
  * 定义具体方法
  * 这时候的trait相当于通用的工具方法
  */
class Traitconcrete {

}

trait  Logger{
  def log(message:String)=println(message)
}

class Hello extends Logger{

  def sayHello(name:String)={
    println("hello,"+name)
    log("sayHello is excuted")
  }

}

