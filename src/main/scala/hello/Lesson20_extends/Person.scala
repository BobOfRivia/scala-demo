package hello.Lesson20_extends

/**
  * scala中，让子类继承父类，与java一样，也是使用extends关键字
  * 功能类似java的extends ,final修饰的方法无法重写
  */
class Person {

   val name = "Leo"

  def getName =name

  def test: Unit ={
  }

  def test1="jack"

}

class Student extends  Person{

  private var score = "A"
  def getScore = score

  //与java  override相同
  //可以重写父类的val属性
  override val name: String = "Jack"
  override def getName: String = "Hi,"+super.getName
  override def test: Unit = super.test

}

object test extends App{

  val p:Person = new Student
  var s:Student = null

  //asInstanceOf 转换错误会抛异常
  //因此需要做判断
  if(p.isInstanceOf[Student]) s=p.asInstanceOf[Student]

  print(s)
  print(p)

  //但isInstanceOf是有局限性的，它无法判断是当前类的对象，还是其父类的对象
  //p.isInstanceOf[Person]  ->true

  //getclass  classOf可以精确判断
  p.getClass == classOf[Person]
  p.getClass == classOf[Student]


}

