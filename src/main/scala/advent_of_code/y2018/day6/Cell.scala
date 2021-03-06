package advent_of_code.y2018.day6

sealed trait Cell{}

case class Danger(name: String, point: Point) extends Cell

case class EmptyCell() extends Cell

case class Closest(danger: Danger) extends Cell

case class Point(x: Int, y: Int) {
  def distance(point: Point): Int = {
    Math.abs(x - point.x) + Math.abs(y - point.y)
  }
}
