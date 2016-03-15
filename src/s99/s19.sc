//P19 (**) Rotate a list N places to the left.
//  Examples:
//
//  scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

object s19 {

  def rotate(dimension: Int, aList: List[Any]): List[Any]  = {
    val nBounded = if (aList.isEmpty) 0 else dimension % aList.length
    if (nBounded < 0) rotate(nBounded + aList.length, aList)
    else (aList drop nBounded) ::: (aList take nBounded)
  }

  rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

}