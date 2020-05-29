package Spice

class SimpleSpice (var name:String, var spiciness:String = "mild")
{
    val heat:Int
    get()
    {
        return when(spiciness)
        {
            "negligible " -> 1
            "low" ->3
            "mild" -> 5
            "normal" -> 7
            "extreme" -> 10
            else -> 12
        }
    }

    fun makeSalt () = SimpleSpice("salt")
    init {
        println("\n Name of spice: ${this.name}  Heat:  ${this.heat}" )
    }
}
