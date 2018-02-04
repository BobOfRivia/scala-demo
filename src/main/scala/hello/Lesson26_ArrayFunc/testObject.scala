package hello.Lesson26_ArrayFunc

/**
  * Created by JACK on 2018/2/4.
  */
object testObject {

  def main(args: Array[String]): Unit = {
    var lt2= scala.collection.mutable.LinkedList(1,2,1,2,5,1,2,456,2,1,23,4)
    //案例一、使用while循环将LinkedList每个元素 * 2
    /**
      * 无法理解
      * 为什么函数没有对lt2进行操作，lt2的数值参与了计算？？
      * 推理：集合lt2 赋值给 currentList 之后
      * 两者元素是引用关系
      */
    var currentList = lt2
    while(currentList != Nil){
      currentList.elem = currentList.elem *2
      currentList = currentList.next
    }
  }

}
