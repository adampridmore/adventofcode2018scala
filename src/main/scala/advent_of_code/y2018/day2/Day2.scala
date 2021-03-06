package advent_of_code.y2018.day2

import Day2._

class Day2(data: String) {
  def solution_part1(): Int = {
    val lines = parseTextToLines(data)

    val duplicatesCount = lines.count(hasTwoDuplicates)
    val triplicateCount = lines.count(hasThreeDuplicates)

    duplicatesCount * triplicateCount
  }
}

object Day2 {
  def hasThreeDuplicates(str: String): Boolean = {
    hasExactlyXDuplicates(str, 3)
  }

  def hasTwoDuplicates(str: String): Boolean = {
    hasExactlyXDuplicates(str, 2)
  }

  private def hasExactlyXDuplicates(str: String, numberOf: Int) = {
    val grouped =
      str
        .toCharArray
        .groupBy(identity)

    grouped.exists({ case (_, items) => items.length == numberOf })
  }

  def parseTextToLines(data: String): Array[String] = {
    data.split("\\r?\\n")
  }
}