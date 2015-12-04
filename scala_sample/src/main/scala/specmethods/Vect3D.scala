package specmethods

/**
  * Created by viktor.kadol on 27.11.15.
  */
case class Vect3D(x: Double, y: Double, z: Double) {
  def apply(i: Int): Double = i match {
    case 0 => x
    case 1 => y
    case 2 => z
  }

  def +++(v: Vect3D) = Vect3D(x + v.x, y + v.y, z + v.z)

  def -(v: Vect3D) = Vect3D(x - v.x, y - v.y, z - v.z)

  def *(c: Double) = Vect3D(x * c, y * c, z * c)

  def /(c: Double) = Vect3D(x / c, y / c, z / c)

}

object Vect3D extends App {
  val v1 = Vect3D(1, 2, 3)
  val v2 = Vect3D(4, 5, 6)
  println(v1 +++ v2)
  println(v1 - v2)
  println(v1 * 2)

  import  VectScalar._

  println(2.0 * v1)
  "This is a test.".filter(_ != ' ')

}