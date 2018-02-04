package hello.Lesson18_obj

/**
  * 构造函数
  */
class Student_constructor {

  private var name = ""
  private var age=0

  //辅助构造函数
  def this(name:String){
    this()
    this.name=name
  }

  def this(name:String,age:Int){
    //可以相互调用
    this(name)
    this.age=age
  }

}

object test4{
  def main(args: Array[String]): Unit = {
    var student= new Student_constructor()
    var student1= new Student_constructor("jack")
    var student2= new Student_constructor("jack",27)

  }

}
