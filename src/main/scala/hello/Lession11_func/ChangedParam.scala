package hello.Lession11_func

/**
  * 变长参数.
  */
object ChangedParam {

  //参数长度可变
  def myJoin(words:String*)={
    var strList = for(str <- words) yield str
    println(strList)
  }

  def max(nums:Int*)={
    var max=Integer.MIN_VALUE;
    for(num <- nums if(max < num))max=num
    println(max)
  }

  def min(nums:Int*)={
    var max=Integer.MAX_VALUE;
    for(num <- nums if(max > num))max=num
    println(max)
  }

  def sum(nums:Int*)={
    var total=0
    for(num <- nums)
      total += num
    println(total)
  }

  /**递归函数-实现累加
    * nums 对象是scala.collection.immutable.Range.Inclusive
    * scala.collection.immutable.Range.Inclusive
    * API中有tail、head函数
    *
    * @param nums
    * @return
    */
  def recsum(nums:Int*):Int={
    if(nums.length == 0)
      0
    else
      nums.head+recsum(nums.tail: _*)
  }


  def main(args: Array[String]): Unit = {
    myJoin("My","Name","is","Daddy")
    max(1,2,3,1,2,3,6,7,3,34,2,3134532,41)
    min(-21311,2,3,1,2,3,6,7,3,34,2,3134532,41)
    sum(1 to 5: _*)
    println(recsum(1 to 5: _*))
  }



}
