package hello.Lesson16_map

/**
  * Map 和 Tuple
  * Map 默认是不可变的
  */
object mapAtuple {

  def main(args: Array[String]): Unit = {


  }


  //创建一个不可变的Map
  val args = Map("Jack" -> 27,"Jane" -> 28 ,"Erica" -> 25)
  //args: scala.collection.immutable.Map[String,Int] = Map(Jack -> 27, Jane -> 28, Erica -> 25)
  //其中 immutable是不可变的意思
  //对于不可变Map--修改其元素
  val args2 = args + ("Jane" -> 18)
  val args3 = args -"Jack"
  //对于此操作，args本身没有改变，只是赋值给了新的Map


  //创建一个可以修改的Map
  val cgs = scala.collection.mutable.Map("Jack" -> 27,"Jane" -> 28 ,"Erica" -> 25)
  //创建一个可以修改的Map,方法二
//  val cgs = scala.collection.mutable.Map(("Jack" -> 27),("Jane" -> 28),("Erica" -> 25))
  println(cgs("Jane"))
  cgs("Jane")=18
  println(cgs("Jane"))

  //对Map元素访问
   args("Bob")
  //Exception==》 Key不存在会报错
  //显得臃肿
  if(args.contains("Bob")) args("Bob") else 0

  //等同于上句
  args.getOrElse("Bob",0)

  //添加元素 等同于ArrayBuffer
  cgs += ("Aimer"->10,"Jone" -> 12)
  //移除元素
  cgs -= "Jack"


  //创建一个空的HashMap
  //Map是个接口，不能实例化
//  var hashMap = scala.collection.mutable.Map[String,Int]
  var hashMap = scala.collection.mutable.HashMap[String,Int]()

  /**
    * 遍历Map
    */
  for((key,value) <- cgs) println(key+" "+value)
  for(tuple <- cgs) println(tuple._1+" "+tuple._2)

  for(key <- cgs.keySet) println(key)

  for(value <- cgs.values) print(value)

  //转置
  for((key,value) <- cgs) yield (value,key)

  /**
    * 自动排序的Map -- 》 SortedMap
    */
  val sortedMap = scala.collection.immutable.SortedMap("Jack"->18,"Aimer" -> 29,"jack" ->17,"Zoom" ->56)

  /**
    * 默认的Map 是不维护插入顺序的
    * LinkedHashMap 会维护插入顺序
    */
    //??不加new 关键词 就不能用 map("key")=value 的方式赋值，为什么
  val linkedHashMap = new scala.collection.mutable.LinkedHashMap[String,Int]
  linkedHashMap("Jack") = 19
  linkedHashMap("Jane") = 18
  linkedHashMap("Flash") = 26


  /**
    *
    * Tuple ---特殊的元素类型
    * (el1,el2,els...) 这种形式的元素 就是Tuple元素
    * Tuple 元素很灵活！
    * 实际上 Map 就是一个Tuple 的数组
    * 元素的key为tuple._1  value为tuple._2
    *
    */
  val t = ("leo",30,1)
  t._1
  t._2
  t._3

  /**
    * Zip操作 拉链操作
    *
    * 将两个数组，成对地拼接
    *
    */
  val Names = Array("Jack","Bob","Jane","King")
  val ages = Array(26,12,16,67)
  val nameAges = Names.zip(args)
  for((name,age) <- nameAges ) println(name + " " + age)
  for(tuple <- nameAges ) println(tuple._1 + " " + tuple._2)














}
