package hello.Lesson21_extends

/**
  * 抽象类
  * 1、若一个类的方法无法立即实现，需要依赖于不同子类实现，可以定义抽象类。只有方法签名
  * 2、一个类只要有一个抽象方法，就必须定义为abstract,此时抽象类无法实例化
  * 3、在子类中覆盖抽象类的抽象方法时，不需要
  */
class AbstractClazz {

}

abstract class PersonAbs(name :String){
  //抽象的field
  val age:Int
  //抽象的方法
  def sayHello:Unit
}

class StudentAbs(name:String) extends PersonAbs(name){
  //子类必须覆盖父类的抽象field
  val age:Int =30

  override def sayHello: Unit = {
    println("Hello,"+name+" Good afternoon!")
  }
}


