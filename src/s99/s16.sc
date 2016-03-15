//P16 (**) Drop every Nth element from a list.
//Example:
//
//  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
object s16 {

  def drop(indexed: Int, aList: List[Any]): List[Any] = {
    val indexes = (indexed - 1) to aList.length by indexed
    aList filter (x => !(indexes contains aList.indexOf(x)))
  }

  drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
}
