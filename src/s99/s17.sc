//P17 (*) Split a list into two parts.
//  The length of the first part is given. Use a Tuple for your result.
//
//Example:
//
//  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

object s17 {

  def split(size: Int, aList: List[Any]): Tuple2[List[Any], List[Any]] = {
    aList span (x => aList.indexOf(x) < size)
  }

  split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

}