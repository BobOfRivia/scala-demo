package hello.Lesson18_obj

import scala.beans.BeanProperty

/**
  * Created by JACK on 2018/2/1.
  */
class Student {


  /**
    * @ BeanProperty 注解，可以生成两种getter、setter，一种是scala的：newAge,newAge_;
    * 另一种是Java风格的：getNewAge、 setNewAge
    */
  @BeanProperty  var newAge = 0

//  def apply(newAge :Int): Student = {
//      new Student
//  }

  def age_=(age:Int): Unit ={
    if(age > 0){
      newAge=age
    }else{
      println("ILLEGAL AGE!!!")
    }
  }

  def age=newAge

  def olderThan(student:Student)={
    //Point: 虽然newAge 是private ，并且student是其他对象。
    //但是只要在类内部，就能直接访问
    newAge > student.newAge
  }
}

object test{
  def main(args: Array[String]): Unit = {

    var student = new Student();
    student.age_=(10)
    var student1=new Student();
    student1.age_=(20)
    println(student.age)
    println(student.getNewAge)
    println(student1.age)
    println(student1.olderThan(student))


    //


  }



}

