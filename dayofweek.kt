import java.util.*

fun  dayOfWeek()
{
    var a : Int = 0
    a = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (a)
    {
        1 -> print("Sunday")
        2 -> print("Monday")
        3 -> print("Tuesday")
        4 -> print("Wednesday")
        5 -> print("Thursday")
        6 -> print("Friday")
        7 -> print("Saturday")
    }
}

fun main (args: Array<String>)
{
     dayOfWeek()
}