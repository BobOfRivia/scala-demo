package hello

/**
  * 循环语句
  */
class ForLogic {

  def main(args: Array[String]): Unit = {
    var n = 10
    while(n>0){
      println(n+" ")
      n-=1
    }

    println("==============For====")

    for(i <- n to 10)
      print(i+" ")
    println("==============For until====")
    for(i <- n until 20)
      print(i + " ")
    println("==============增强For循环====")

    for(i <- "I LOVE JANE")
      print(i+" ")


    import scala.util.control.Breaks._

    for(i <- "I LOVE JANE"){
      if(i.equals('E')) break;
      print(i)
    }

    //99乘法表

    println()
    for(i <- 1 to 9;j <- 1 to 9){
      if(j == 9){
        println(i*j)
      }else{
        print(i * j)
        print(" ")
      }
    }

    //打印1-20所有偶数
    for(i <- 1 to 20 if i % 2 == 0)
      println(i)


    //for推导式 ：构造集合
    for(i <- 1 to 10)
      yield i

  }

}
