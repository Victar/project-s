/**
  * Created by viktor.kadol on 27.11.15.
  */

import org.junit._
import org.junit.Assert._
import specmethods.Vect3D


class TestVect3D {

  @Test def testAddition = {
    val v1 = Vect3D(1, 2, 3)
    val v2 = Vect3D(4, 5, 6)
    val v3 = v1 +++ v2
        assertEquals("Additional failed", Vect3D(5, 7, 9), v3)
  }

}