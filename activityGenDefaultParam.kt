import java.util.*

fun main(args:Array<String>)
{
    print(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday (
        mood:String,
        weather:String = "sunny",
        temperature:Int = 24 ) :String
{
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "sad"  && weather == "rainy" -> "Stay home and read"
        mood == "sad" && weather == "sunny" -> "Go out for a walk"
        else -> "sleep"
    }


}