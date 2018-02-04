package hello.Lesson21_extends

/**
  * Created by JACK on 2018/2/2.
  */
class constructorDemo {

}

class Person3(val name:String,val age:Int){}

/**
  * 以下写法为 通过子类的主构造函数 来调用父类构造函数
  * 参数不能用val var之类的修饰
  * @param name
  * @param age
  * @param score
  */

//此为主构造函数
class Student3(name:String,age:Int,var score:String) extends Person3(name,age){

  //此为辅助构造函数
  def this(name:String){
    this(name,30,"A")
  }

  //此为辅助构造函数
  def this(age:Int){
    this("jack",age,"A")
  }

  override def toString: String = {
    "name="+name+"  age="+age+"  score="+score
  }



}


