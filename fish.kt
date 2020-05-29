package Aquarium

//since volumeNeeded does not have a "val" or "var" so its properties are not defined
class fish (var friendly:Boolean=true,volumeNeeded:Int)
{
    val size:Int

    init {
        println("first init box")
    }

    init {
        if(friendly)
            size = volumeNeeded
        else
        {
            size = volumeNeeded * 2
        }
    }

}

fun fishExample ()
{
    var fish1 = fish(true,20)
    println("Is this fish friendly?: ${fish1.friendly} \n" +
            "it needs ${fish1.size} liters")
}
