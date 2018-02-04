package hello.Lesson22_trait

/**
  * 一、作为接口使用
  * Pation:
  *   形式上类似与 继承父类class
  *   但是从编译的结果来看是不一样的
  *     trait的继承：
  *       解释后trait类，等同与 abstarct interface
  *       解释后的源码为 implements 实现父类
  *       子类继承获得的属性是属于自己的，他在子类中重新定义了属性
  *     class的继承:
  *       解释后的源码为 extends 继承父类
  *       子类获得的属性是属于父类的，他只是在子类中引用了父类的属性
  */
class asInterface {}

trait HelloTrait{
//  //若定义的是抽象属性
//  //则会被编译为，abstract类 和abstract属性
//  var name:String
//  //源码提供setter方法
//  //若初始化则会 $init$
//  var age = 13
//  val score = "A"
  def sayHello(s:Student)
}

trait makeFirendsTrait{
  def makeFriends(s:Student) ={
    println("Let's makeFriends ok? "+s.name)
  }
}

//分析源码后：name是在class中重新定义的
class Student(var name:String) extends HelloTrait with makeFirendsTrait{
  def sayHello(s: Student): Unit ={
    println("Hello,"+s.name+" my name is "+this.name)
  }

  def enjoyHolidayWith(s:Student): Unit ={
    sayHello(s)
    makeFriends(s)
  }

}




