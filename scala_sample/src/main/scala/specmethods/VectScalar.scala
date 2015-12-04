package specmethods

/**
  * Created by viktor.kadol on 27.11.15.
  */
object VectScalar {
  implicit def convert(c: Double): VectScalar = new VectScalar(c)
}

class VectScalar(c: Double) {
  def *(v: Vect3D) = v * c
}