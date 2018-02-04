package hello.Lesson18_obj

/**
  * Created by JACK on 2018/2/1.
  */
class StudentPriv {

  private[this] var newAge = 0

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

  def olderThan(student:StudentPriv)={
    //Point: private[this] 表示，这个属性只能在这个实例对象中使用
    //student.newAge 错误
    newAge > student.age
  }
}

object test1{
  def main(args: Array[String]): Unit = {

    var student = new StudentPriv();
    student.age_=(10)
    var student1=new StudentPriv();
    student1.age_=(20)
    println(student.age)
    println(student1.age)
    println(student1.olderThan(student))



  }



}

