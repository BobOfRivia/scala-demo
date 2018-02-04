package hello.Lession10_function

/**
  * 默认参数设置
  * *JAVA 需要判断*
  *
  */
object DefaultParam {

  def sayHello(firstName : String,middleName : String ="mn",lastName:String = "ln"): Unit ={
    printf("Hello,%s %s %s",firstName,middleName,lastName)
    println()
  }

  def main(args: Array[String]): Unit = {
    sayHello("Jack","Jane")

    //可以指定参数顺序
    sayHello("Jack",lastName="Jane")

  }


}
