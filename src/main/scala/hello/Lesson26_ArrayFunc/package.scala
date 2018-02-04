package hello

import scala.collection.mutable

/**
  * Scala集合操作
  *
  * 集合体系主要包含：Iterable,Seq,Set,Map
  * ---其中Iterable是所有trait的根trait
  *
  * Scala分成：
  * 可变集合
  * ---scala.collection.mutable
  * 不可变集合
  * ---scala.collection.immutable
  *
  * Seq下包含Range、ArrayBuffer、List等子trait.
  * ---其中Range就代表一个序列 通常用1 to 10
  * ---1 to 10
  * ------将1:Int 隐式(implicit)转换成 1:RichInt
  * ------RichInt 的 API中包含了 ：to   until ...
  *
  */
package object Lesson26_ArrayFunc {

  /**
    * List :
    * res1: scala.collection.immutable.List.type(不可变)
    *
    */
    //List创建
  val lt0 = List(1,2,3,4,5)
  val lt1 = List.apply(1,2,3,4,5)

  //元素操作 head tail
  println(lt0.head)
  println(lt0.tail)
  //通过head & tail 来遍历元素

  //注意，指定类型时，必须检查一下类型的源码，确定它的初始化类型
  /**
    * 递归操作List
    * @param list
    * @param count
    */
  def loopList(list:List[Int],count:Int=0):Unit={
    if(list != Nil){
      println("found : "+list.head)
      loopList(list.tail,count+1)
    }
  }
  loopList(List(1,2,3,4,5,6,7,8,9,2,3,4,5,6,3))
  //重要：List有一个特殊操作符 ::
  //用作在List基础上拼接字符，生成一个新的List
  12::lt0


  /**
    * LinkedList
    * elem 、next = List的head、tail
    */



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

  //案例二、 使用whild循环将LinkedList 每隔一个元素 * 2
  var lt3= scala.collection.mutable.LinkedList(1,2,3,4,5,6,7,8,9,10)
  var currentList1 = lt3
  var count = 0
  while(currentList1 != Nil){
    count+=1
    if(count % 2 == 1){
      currentList1.elem = currentList1.elem * 2
    }
    currentList1 = currentList1.next
  }
  lt3
  //bad function Wrong and stupid
  //  var lt4= scala.collection.mutable.LinkedList(1)
  //  var currentList2= lt4
  //  var first= false
  //  while(currentList2 != Nil && currentList2.next != Nil){
  //    if(!first){first=true;currentList2.elem=currentList2.elem*2}
  //    else{
  //      currentList2=currentList2.next.next
  //      currentList2.elem=currentList2.elem*2
  //    }
  //  }




}
