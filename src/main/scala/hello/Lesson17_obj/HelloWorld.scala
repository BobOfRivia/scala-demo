package hello.Lesson17_obj

/**
  * Created by JACK on 2018/2/1.
  */
class  HelloWorld {
  private var name = "jack"
  def sayHello(){println("Hello,"+name)}
  def getName={this.name}

  /**
    * 知识点一、
    * var定义的class属性，scala会自动加上private修饰，并生成getter、setter方法
    */
  var age = 18

  /**
    * 若属性是private修饰，则生成的getter setter也将是private
    */
  private var address="苏州"

  /**
    * 知识点三、val field ,只会生成getter方法
    */
  val sex = "Man"

  /**
    * 知识点四、如果不希望生成getter、setter 则将field声明为private[this]
    */
  private[this] var goal = "teacher"

  /**
    * 自定义 getter 、 setter
    */
  def addr="MyAddress is "+address
  //注意 等号左右不能有空格
  //可以使用private 来单独修饰
  def addr_=(address:String): Unit ={
    println("I change to "+address)
    this.address=address
  }



}

object obj{
  def main(args: Array[String]): Unit = {
    var helloWorld = new HelloWorld
    helloWorld.sayHello()
    println(helloWorld.getName)
    println(helloWorld.age)
    helloWorld.age = 12
    println(helloWorld.age)

    println(helloWorld.addr)
    helloWorld.addr="bob"

  }

}
