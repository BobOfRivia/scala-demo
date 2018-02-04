package hello.Lesson23_trait_adv

/**
  * 覆盖trait抽象方法
  */
class overrideAbs {}

trait Logger1{
  def log(msg:String)
}

trait MyLogger1 extends Logger1{
    abstract override def log(msg: String): Unit = {"MyLogger==>"+super.log(msg)}
}


