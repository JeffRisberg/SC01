package hackerdojo

import java.lang.String

/**
 * @author Jeffrey Risberg
 * @since 01/23/14
 */
object Example {
  def main(args: Array[String]) {

    args.map {
      println _
    }

    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val nums: Map[Int, Int] = Map()

    println("Keys in colors : " + colors.keys)
    println("Values in colors : " + colors.values)
    println("Check if colors is empty : " + colors.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)

    val names = List(
      "Alpha",
      "Beta",
      "Gamma"
    )

    val x = names.map {
      println _
    }

    val documents = List(
      Map("tab" -> "0",
        "name" -> "Dashboard 1",
        "widgets" -> List(
          Map("type" -> "piechart",
            "row" -> 0,
            "col" -> 0),
          Map("type" -> "barchart",
            "row" -> 0,
            "col" -> 1)
        )
      ),
      Map("tab" -> "1",
        "name" -> "Dashboard 2",
        "widgets" -> List(
          Map("type" -> "scatterchart",
            "row" -> 0,
            "col" -> 0),
          Map("type" -> "columnchart",
            "row" -> 0,
            "col" -> 1)
        )
      )
    )

    val transformed = documents.map {
      _.map {
        case (tabKey, tabValue) => tabKey match {
          case "widgets" => tabKey -> "block"
          case _ => tabKey -> tabValue
        }
      }
    }

    transformed.map {
      println _
    }

    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")

    val colors2 = Map("pink" -> "#FFFFFF")
  }
}