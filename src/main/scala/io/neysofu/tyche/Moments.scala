package io.neysofu.tyche

/** Features some basic numerical analysis methods.
  */
trait Moments[A] {

  /** Returns a multiline string representation of the current instance.
    */
  def plot(implicit toDouble: A <:< Double): String

  /** Returns the expected value (mean).
    */
  def mean(implicit toDouble: A <:< Double): Double

  /** Returns the standard deviation.
    */
  def standardDeviation(implicit toDouble: A <:< Double): Double

  /** Returns the variance.
    */
  def variance(implicit toDouble: A <:< Double): Double =
    Math.pow(standardDeviation, 2)
}
