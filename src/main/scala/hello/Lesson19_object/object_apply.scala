package hello.Lesson19_object

/**
  * object中非常重要的一个方法，就是apply方法
  * 通常在伴生对象中实现apply方法，并在其中实现构造半生类对象的功能
  * 创建半生类对象时，通常不会使用new class ,而是直接用class(),其中的（）隐式地调用了apply()方法
  *
  */
class object_apply(name:String) {
  println(name+",I love you")
}

object object_apply{
  def apply(name:String) = new object_apply(name)
}
