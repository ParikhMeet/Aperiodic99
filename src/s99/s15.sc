//P15 (**) Duplicate the elements of a list a given number of times.
//Example:
//
//  scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

object p14 {

  def duplicateN(times: Int, aList: List[Any]): List[Any] = {
    aList flatMap( x => List.fill(times)(x))
  }

  duplicateN(3, List('a', 'b', 'c', 'c', 'd'))

}