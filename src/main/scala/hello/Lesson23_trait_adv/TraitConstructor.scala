package hello.Lesson23_trait_adv

/**
  * Trait构造机制
  */
class TraitConstructor {}

trait Logger0{

  /**
    * 重要！！
    * 根据结论，该构造函数是会先执行的
    * 执行时msg还未初始化
    * 因此，msg.toString 为空指针
    */
//  var msg:String
//  println(msg.toString)
 println("Logger0 is constructed!!")
}

trait MyLogger0 extends Logger0{
  println(" MyLogger0 is constructed!!")
}

trait TimeLogger0 extends  Logger0{
  println(" TimeLogger is constructed!!")
}

class Person0{
  println("Person0 is constructed!!")
}

/**
  * 由此可见 构造顺序为 父类>trait父类>trait子类（左）>trait子类（右）>当前类
  */
class Student0 extends Person0 with MyLogger0 with TimeLogger0{
  var msg=""
  println("Student0 is constructed!!")
}

//Person0 is constructed!!
//Logger0 is constructed!!
//MyLogger0 is constructed!!
//TimeLogger is constructed!!
//Student0 is constructed!!


