package hello.Lesson19_object

/**
  * scala的Object 是静态 单例的
  * 因此可以放置一些共享的属性，不依赖于任何类的方法
  *
  *
  * 类似与JAVA中的static
  */
 object myObject {

  private var eyeNum = 2
  println("this Person Object")
  def getEyeNum = eyeNum

  def test(name:String)={
   print("name is "+name)
  }

// def apply(name:String) ={
//  print(name)
// }

 //不能定义接收参数的构造方法
// def apply: myObject = new myObject()

  def main(args: Array[String]): Unit = {
//   myObject.apply("sfgnhja")
   myObject.test("JACK")
   myObject.getEyeNum
  }
 //result:this Person Object
 /**
   * 第一次调用object方法时，会执行object的constructor,也就是object内部不在method中的代码。
   */


}


