package beginners_guide_to_scala

/**
  * 提取器：是拥有unapply方法，并使用unapply作为其成员变量
  * unapply 提取参数
  * 多用于匹配模式
  */
object Twice {
  def apply(x: Int): Int =
    x * 2

  def unapply(z: Int): Option[Int] =
    if (z%2 == 0) Some(z/2) else None

  def main (args: Array[String] ): Unit = {
    val x = Twice(21)
    x match { case Twice(n) =>Console.println(1) } // prints 21
  }

}

