import java.util.*

fun main (args:Array<String>)
{
    var decor = listOf("rock","pagoda","plastic flower", "alligator","flower pot")
    
    //printing the values in decor which has starting alphabet as p
    println (decor.filter {it[0]=='p'})
}
