package hello.Lesson15_arr

/**
  * Created by JACK on 2018/1/31.
  */
 object arrOp {


  def main(args: Array[String]): Unit = {

    //对Array进行转换，yield之后获取的还是Array
    val a= Array(1,2,3,4,5)
    for( el <- a)
      yield el*el

    //BufferArray转换
    import scala.collection.mutable.ArrayBuffer
    val b = ArrayBuffer(1,2,3,41,2,31,5,412,12,3,2)
    //结合if守卫 按照条件转换
    for(el <- b if el % 2 ==0 ) yield el


    val c= Array(1,2,3,4,5)
    //使用函数式编程转换数组（通常使用第一种方式）
    c.filter(_ % 2 ==0).map(2*_)
    c.filter(_ % 2 ==0)map(2*_)

    /**
      * 移除第一个负数之后的所有负数
      */
    import scala.collection.mutable.ArrayBuffer
    var d = ArrayBuffer[Int]()
    d += (1,2,3,1,2,4,5,1,23,45,-12,-1,2,21,-3,1,12,-2)
    var hasfindOne = false
    var e = ArrayBuffer[Int]()
    for(i <- d){
      if(hasfindOne == false){
        e += i
        if(i<0){
          hasfindOne=true
        }
      }else{
        if(i>0){
          e += i
        }
      }
    }
    println(e)

    //想法很好 ，性能很差
    import scala.collection.mutable.ArrayBuffer
    var f = ArrayBuffer[Int]()
    f += (1,2,3,1,2,4,5,1,23,45,-12,-1,2,21,-3,1,12,-2)
    var hasfindOne1 = false
    var index = 0
    var flen = f.length
    while(index < flen){
      if(f(index)>0){
        index += 1
      }else{
        if(hasfindOne1 == false ) {hasfindOne1=true ;index+=1}
        else{
          f.remove(index)
          flen -= 1
        }
      }
    }
    println(f)


    //最优版本--一次性剔除
    //这他妈才是算法
    import scala.collection.mutable.ArrayBuffer
    var g = ArrayBuffer[Int]()
    g += (1,2,3,1,2,4,5,1,23,45,-12,-1,2,21,-3,1,12,-2)
    var hasfindOne2 = false
    var keepIndexes = for(i <- 0 until g.length if (hasfindOne2 == false||g(i)>=0) )
      yield{
        if(g(i)<0) hasfindOne2=true
        i
      }

    for(i <- 0 until keepIndexes.length)
      g(i)=g(keepIndexes(i))
    g.trimEnd(g.length-keepIndexes.length)
    println(g)

  }


}
