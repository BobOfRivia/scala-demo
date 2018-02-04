package hello.Lesson18_obj

/**
  * 主构造函数
  */

//参数 name:
class Student_main_constr(name:String,age:Int) {
  println(name+" is "+age +" years old");
}

class Student_main_constr1(val name:String="jack", val age:Int=27) {
  println(name+" is "+age +" years old");
}

object test5{
  def main(args: Array[String]): Unit = {

    var student1 = new Student_main_constr1()
    var student2 =new Student_main_constr("jane",28)

    var student3 = new Student_main_constr1("jack1",123)

  }



}
