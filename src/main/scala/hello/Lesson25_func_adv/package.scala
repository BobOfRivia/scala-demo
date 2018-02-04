package hello

/**
  * Created by JACK on 2018/2/4.
  */
package object Lesson25_func_adv {

  Array(1,2,3,4,5,6).map(2 * _)

  (1 to 9).map("*" * _).foreach(println _)

  println("===========reduceLeft======")
  (1 to 9).reduceLeft(_ * _)
  def devisionFunc(v1:Int,v2:Int) = {
    println(v1 +"/"+v2)
    v1/v2
  }
  def multiFunc(v1:Int,v2:Int)={
    println(v1+"*"+v2)
    v1*v2
  }
  /**
    * NullPointException
    * 8/9
    * 7/0
    */
  (1 to 9 ).reduceRight(devisionFunc)

  Array(12,2,1,3,56,7,80,3,27).sortWith(_ < _)
  def Mysort(v1:Int,v2:Int)={println(v1+"<"+v2);v1<v2}
  Array(12,2,1,3,56,7,80,3,27).sortWith(Mysort)


  /**
    * closure 闭包
    * 函数在变量不处于其有效作用域时，还能对变量进行访问，即为闭包
    *
    * 例中，msg只是一个局部变量
    * 却在执行完毕以后，还可以继续存在被创建的函数之中。
    * 这种变量超出了其作用域。还可以使用的情况，即为闭包
    *
    * scala在解释函数时，为每个函数创建一个函数对象，其中的参数作为了函数对象的变量存在。因此每个函数才可以拥有不同的msg
    */
  //柯里函数
  def getGreetingFunc(msg:String)=(name:String)=>println(msg+","+name)
  def getGreetingFunc1(msg:String,name:String)=println(msg+","+name)
  def getGreetingFunc2(msg:String)(name:String)=println(msg+","+name)
  getGreetingFunc("Hello")("Jack")
  var greetingHello=getGreetingFunc("Hello")
  var greetingHi=getGreetingFunc("Hi")
  //Hello
  greetingHello("Jack")
  greetingHi("Jone")

  /**
    * SAM:JAVA
    *   Java中不支持直接将函数作为参数传入方法。
    *   唯一的解决办法定义一个实现了接口的实例对象，该对象只有一个方法
    *   而这些接口都只有单个的抽象方法
    *   single abstract method SAM
    */
  import javax.swing._
  import java.awt.event._

  var button = new JButton("Click")

  //Scala想实现的效果为：
//  button.addActionListener((e:ActionEvent)=>println("Click me!!!"))
  //显然，编译不通过
  button.addActionListener(new ActionListener {
    override def actionPerformed(e: ActionEvent): Unit = {
      println("Click me !!")
    }
  })


  /**
    * SAM转换:Scala
    * 通过隐式类型转换
    *   ps:后面的教程完善
    */
  //隐式类型转换函数
  implicit def convertActionListener(actionProcessFunc:(ActionEvent)=>Unit)=new ActionListener {
    override def actionPerformed(e: ActionEvent): Unit = {
      actionProcessFunc(e)
    }
  }
  //在调用对应函数时，会进入定义的隐式函数
  button.addActionListener((e:ActionEvent)=>println("Click me!!!"))


  /**
    * return
    * Scala中是不需要return 返回参数的
    * 有一种情况必须用到return, 使用return 必须指明返回类型
    * 咦？貌似也不需要return 莫非新版本调整了？
    */
  def greeting(name:String)={
    def sayHello(name:String)={
      "Hello, "+name
    }
    sayHello(name)
  }
  greeting("Jack")








}
