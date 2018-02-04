package hello.Lesson23_trait_adv

/**
  * trait field 初始化
  * trait 的field本身是不能初始化的
  *
  *
  */
class traitFieldInit {}

//通常，这种情况下，一旦调用构造函数，会报空指针异常
trait sayHello3{
  var msg:String
  print(msg.toString)
}

class Person2

/**
  * 此做法会导致 空指针异常
  */
//class Person2 extends sayHello3{
//  var msg="Hello"
//}

//方案一、
//val p4 = new{
//var msg:String="Hello"
//}with Person2 with sayHello2

//方案二
//这个可以理解，按照之前的构造顺序
class Person3 extends {
  var msg="Hello"
}with sayHello3

trait sayHello4{
  lazy val msg:String = null
  print(msg.toString)
}

//方案三
//父trait属性用lazy修饰
//子类重写父trait的lazy属性
class Person4 extends sayHello4{
  override lazy val msg: String = "Hello lazy"
}




