package hello.Lesson23_trait_adv

/**
  * trait调用链
  *
  *
  * 职责链模式：
  * extends DataDealHandler with ValidataHandler
  * 从右往左执行
  *
  */
class chainModel {

}

trait chain{
  def handle(name:String){}
}

trait DataDealHandler extends chain{

  override def handle(name:String): Unit = {
    println(":I do my dataDeal work")
    super.handle(name)
  }
}

trait ValidataHandler extends chain{

  override def handle(name:String): Unit = {
    println(":I do my validata work")
    super.handle(name)
  }

}

class Person(name:String) extends DataDealHandler with ValidataHandler{

  def makeFriends={
    println("Hello "+name+" i will check your credit")
    handle(name)
  }
}

