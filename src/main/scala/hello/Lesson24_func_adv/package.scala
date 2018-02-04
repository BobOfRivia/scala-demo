package hello

/**
  * Created by JACK on 2018/2/3.
  */
package object Lesson24_func_adv {

  println("==============Part1")

  /**
    * Part1. 函数可以脱离类单独存在
    * @param name
    */
  //函数可以独立存在
  def sayHello(name:String) = println("Hello,"+name)
  var a = sayHello _
  //也可以采用匿名函数的方式定义变量
  val sayHelloFunc = (name:String) =>println("Hello,"+name)
  sayHelloFunc("Leo")

  println("==============Part2")

  /**
    * Part2. 在Scala中，函数是一等公民，可以直接讲函数作为参数传入其他函数
    * 接收其他函数作为参数的函数，也被称作高阶函数
    */
  //Demo1.
  def greeting(func:(String) =>Unit,name:String){func(name)}
  greeting(sayHello,"Jack")

  //Demo2. Array的map也是高阶函数
  Array(1,2,3,4,5,6).map((num:Int)=> num*num)
//  Array(1,2,3,4,5,6).map(Int=> 2 * _)

  //函数可以作为另一个函数的返回值
  def greetMethod(message:String) = (name:String)=>print(message+name)
  var greetHelloTo = greetMethod("Hello,")
  greetHelloTo("Jacken")

  //高阶函数的类型推断
  def greeting1(func1:String =>Unit,name:String){func1(name)}
  def greeting2(func2:String ,name:String){func2+name}

  greeting1((name:String)=>println("Hello"+name),"Joke")
  greeting1((name)=>println("Hello"+name),"Joke")
  greeting1(name=>println("Hello"+name),"Joke")
  greeting1(name=>println("Hello"+_),"Joke")

  /**
    * 高阶函数推断!
    * @param func
    * @return
    */

  //Demo1
  def triple(func:(Int)=>Int)={func(3)}
  def func1(num:Int) =3* num
  triple(func1)
  //可以简写为
  //Demo2
  def triple2(func:(Int)=>Int)={func(3)}
//  def func2(num:Int) =3* num
  triple2(3* _)
  /**
    * 为什么呢？
    * 分析demo1 &demo2 的区别
    * 推断：在调用triple2 之前
    * 解释器，先将3*_ 转换成 func2函数本身
    * def func2(num:Int)=3*num
    *
    * ps：根据规则，若num在右侧只计算一次，可以将num 用_替代
    */



}
