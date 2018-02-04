package hello.Lesson19_object

/**
  *
  * App Trait的工作原理为：App Trait继承自DelayedInt Trait,scala命令进行编译时，会把继承App Trait的object的constructor代码
  * 放到DelayedInt Trait的delayedInt方法中执行
  *
  */
object main_demo extends App{

//  def main(args: Array[String]): Unit = {
//    println("this is main method")
//  }

  /**
    * Doc中：
    * scalac main_demo.scala
    * scala main_demoleo
    * -->result:Helloleo
    * scala -Dscala.time main_demoleo  显示执行时间
    */
  if(args.length>0) println("Hello" + args(0))
}
