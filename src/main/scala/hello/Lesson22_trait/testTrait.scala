package hello.Lesson22_trait

/**
  * Created by JACK on 2018/2/3.
  */
object testTrait {

  def main(args: Array[String]): Unit = {

    println("======TEST FOR asInterface.scala=======")
    var s = new Student("Jack")
    var s1 = new Student("Bob")
    s.enjoyHolidayWith(s1)

    println("======TEST FOR Traitconcrete.scala=======")
    var hello = new Hello
    println(hello.sayHello("Jack"))

    println("======TEST FOR TraitAbs.scala=======")
    var p = new Person1("Jk")
    var p1 = new Person1("Shordinger")
    p.makeFriends("Shordinger")

  }

}
