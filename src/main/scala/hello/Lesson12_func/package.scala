package hello.Lesson12_func

import java.io.IOException

import scala.io.Source._

/**
  * 函数入门之过程、lazy值和异常
  */
 object progressLazyException {

  //过程：返回为Unit
  def main(args: Array[String]): Unit = {

    //此时未加载
    lazy val file = fromFile("d://my.cnf").mkString;

    //此时才加载
    print(file)


    //异常处理
    try {
      throw new IllegalArgumentException("x Should not be nagative")
    }catch{
      //模式匹配
      case e1:IllegalArgumentException =>println("try to solve this IllegalArgumentException")
      case e2:IOException =>println("try to solve this IOException")
    }finally {
      println("release io resource")
    }

  }

}
