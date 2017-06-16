import java.util.Calendar

/**
  * Created by Administrator on 16/06/2017.
  */
object TomorrowDate extends App {
  def getDate = Calendar.getInstance()
  Thread.sleep(24*60*60*1000)
  println(getDate)
}
