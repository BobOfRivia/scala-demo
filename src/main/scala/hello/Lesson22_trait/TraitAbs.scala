package hello.Lesson22_trait

/**
  * trait中定义抽象字段
  */
class TraitAbs {
}

trait Hello1{
  var message:String
  def sayHello(name:String):Unit={
    println(message+name)
  }
}

class Person1(name:String) extends  Hello1{
  var message = "Hello , "
  def makeFriends(name:String): Unit ={
    sayHello(message+name)
    println("my name is "+ this.name + "and I'm glad to make friends with you "+name)
  }
}


