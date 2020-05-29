import java.lang.StrictMath.random
import java.util.*

fun main (args:Array<String>)
{
    print("Enter sides in dice")
    val sides:Int = readLine()?.toIntOrNull() ?:0

    val rollDice1 = { Random().nextInt(sides)+1 } ()
    val rollDice2 = { sides:Int -> Random().nextInt(sides)+1} (sides)
    val rollDice3 = { sides:Int -> if(sides==0)0 else Random().nextInt(sides)+1} (sides)

    println(rollDice1)
    println(rollDice2)
    println(rollDice3)


    }
}
