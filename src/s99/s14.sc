//P14 (*) Duplicate the elements of a list.
//    Example:
//    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

object p14 {

  def duplicate(aList: List[Any]): List[Any] = {
    aList flatMap (x => List(x, x))
  }

  duplicate(List('a', 'b', 'c', 'c', 'd'))

}