package hello.Lesson19_object

/**
  * 伴生对象 & 伴生类
  * 如果有一个object 和class同名，那么这个object就被成为是这个class的伴生对象，反之便是伴生类
  *
  * Warning:必须存放在一个scala文件中
  *
  * 特性：可以互相访问private field
  */
object Companion {

  private val eyeNum =2
  def getEyeNum = eyeNum

}

class Companion(val name:String, val age:Int) {
  println("hey "+name +" I know your age is "+age+" and usually you have "+Companion.eyeNum+" eyes")
}

//var c = new Companion("Jane",18)

//
//class Companion1(val name:String, val age:Int) {
//  println("hey "+name +" I know your age is "+age+" and usually you have "+Companion.eyeNum+" eyes")
//}
