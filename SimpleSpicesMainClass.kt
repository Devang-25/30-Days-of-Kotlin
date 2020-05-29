package Spice

fun main (args:Array<String>)
{
    //normal function
    makeSpice()
}

fun makeSpice()
{
    //creating object
    val spice1 = SimpleSpice("cayenne")
    val spices = listOf(
            SimpleSpice("turmeric", "negligible"),
            SimpleSpice("pepper", "mild"),
            SimpleSpice("kashmiri chilli", "mild"),
            SimpleSpice("ginger", "low"),
            SimpleSpice("piri piri", "mild"),
            SimpleSpice("red chilli", "extreme"),
            SimpleSpice("garam masala", "extreme")
    )

    val lowHeatSpices = listOf(spices.filter { it.heat<5 })
    print(lowHeatSpices)


}
