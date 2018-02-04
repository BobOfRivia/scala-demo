package hello.Lesson19_object

/**
  * Object实现枚举
  */
object Enumobject extends Enumeration{
  val SPRING,SUMMER,AUTUMN,WINTER=Value
}
object Season extends Enumeration{
   val SPRING = Value(0,"spring")
   val SUMMER = Value(1,"summber")
   val AUTUMN = Value(2,"autumn")
   val WINTER = Value(3,"winter")
}

object test{
  def main(args: Array[String]): Unit = {
    println(Season.SPRING.id)
    println(Season.SPRING.toString)
      println(Season(0))
      println(Season.withName("spring"))
    for(i <- Season.values)
      println(i)

  }
}

