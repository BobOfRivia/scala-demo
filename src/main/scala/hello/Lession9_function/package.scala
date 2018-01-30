package hello


/**
  * Created by JACK on 2018/1/30.
  */
package object Lession9_function {




    def wordsWithoutOutliers(wordFrequencies: Seq[(String, Int)]): Seq[String] =
      wordFrequencies.filter(el => el._2 > 3 && el._2 < 25).map(_._1)



  def main(args: Array[String]): Unit = {

    val wordFrequencies = ("habitual", 6) :: ("and", 56) :: ("consuetudinary", 2) ::
      ("additionally", 27) :: ("homely", 5) :: ("society", 13) :: Nil

    wordsWithoutOutliers(wordFrequencies)

  }

}
