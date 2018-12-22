import org.scalatest.FunSuite

import scala.collection.mutable.ListBuffer
import scala.language.implicitConversions
import Extensions.seqExtensions

class HelpersTest extends FunSuite {
  test("Length extension method") {
    val l = List(1, 2, 3, 4)
    assert(l.myLength2 === 4)
  }

  test("Map with index") {
    import Extensions.seqExtensions

    val listBuffer = new ListBuffer[Int]

    val l = List(10, 20, 30, 40)

    val mapped = l.mapi {
      case (v, i) => listBuffer.append(v); i
    }

    assert(l.head === 10)
    assert(l(1) === 20)
    assert(mapped.mkString("") === "0123")
  }
}
