package textprocessing

/**
  * Created by viktor.kadol on 27.11.15.
  */
object RegExExample1 extends App {

  var phonePatter = """\((\d\d\d)\) (\d\d\d)-(\d\d\d\d)""".r
  var phoneBook =
    """Name1 (210) 333-4444
    Name1 (220) 222-4644
    Name1 (874) 479-2344"""

  for (m <- phonePatter.findAllMatchIn(phoneBook)) {
    val areaCode = m.group(1)
    println(areaCode)
  }
}
