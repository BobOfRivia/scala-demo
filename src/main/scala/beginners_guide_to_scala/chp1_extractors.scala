package beginners_guide_to_scala

/**
  * Created by JACK on 2018/1/31.
  */
object chp1_extractors {

  case class User(firstName: String, lastName: String, score: Int)

  def advance(xs: List[User]) = xs match {
    case User(_, _, score1) :: User(_, _, score2) :: _ => score1 - score2
    case _ => 0
  }

  def main(args: Array[String]): Unit = {

  }

}
