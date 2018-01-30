package hello.Lesson13_arr

/**
  * 数组操作之Array、ArrayBuffer以及比遍历数组
  *
  * Array:长度不可变的数组
  *
  */
object ArrayDemo {

  def main(args: Array[String]): Unit = {

    //Array定义一
    val a =new Array[Int](10)
    //res11: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    a(0)=1

    //Array定义二
    val b = Array("Hello","Scala",30)
    //b: Array[Any] = Array(Hello, Scala, 30)
    b(1)="asd"
    println(b(1))

    /**
      * ArrayBuffer长度可变，类似于JAVA中的ArrayList/LinkedList
      */
    import scala.collection.mutable.ArrayBuffer
    val c = ArrayBuffer[Any]()
    c += 1
    c += (2,3,4,5,10)
    print(c)

    //尾部截断5位
    c.trimEnd(5)
    //加入其他集合元素
    c ++= Array("I","Hope","everything's","OK")

    //中间插入
    c.insert(3,"you","and","me")

    //中间删除
    c.remove(4,2)

    println(c)

    //要创建Array 可以先创建ArrayBuffer再转Array

    c.toArray

    c.toBuffer
    //Array & ArrayBuffer 可以互转


    //Array遍历
    val d = new ArrayBuffer[Int]()
    d+=(1,6,3,4,5,7,1)

    //增强for循环
    for(el<-d)
      println(el)

    //按步长遍历
    for(el <- 0 until (d.length,2) )
      println(d(el))
    println("===以上按步长遍历一====")
    for(el <- 0 until d.length if(el%2==0) )
      println(d(el))
    println("===以上按步长遍历二====")
    for(el1 <- (0 until d.length).reverse)
      println(d(el1))
    println("===以上倒叙遍历====")

    /**
      * 数组其他操作
      */
    var e = ArrayBuffer[Int]()
    e+=(1,2,3,4,5,6,8,11)
    //求和
    println(e.toArray.sum)
    //最大值
    println(e.max)
    //最小值
    println(e.min)
    //排序 --仅针对Array
    println(scala.util.Sorting.quickSort(e.toArray))
    //拼接字符串
    println(e.mkString)
    println(e.mkString(","))
    println(e.mkString("<",",",">"))
    println(e.toString())
    println(e.toArray.toString())


  }

}
