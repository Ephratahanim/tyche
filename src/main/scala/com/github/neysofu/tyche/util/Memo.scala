package com.github.neysofu
package tyche
package util

import scala.collection.mutable.{Map => Dict}

/** A cache system to memoize any function.
 *
 *  @param f the function to memoize.
 *  @tparam I the source type of the given function `f`.
 *  @tparam O the target type of the given function `f`.
 */
case class Memo[I, O](f: I => O) extends (I => O) with Serializable {
  val cache = Dict.empty[I, O]
  override def apply(x: I) = cache.getOrElseUpdate(x, f(x))
}
