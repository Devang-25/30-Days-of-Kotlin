package Aquarium

fun main(args:Array<String>)
{
    buildAquarium() //function
}

fun buildAquarium ()
{
    //creating an object
    val myAquarium = Aquarium()
    
    //accessing attributes
    println ("Length: ${myAquarium.length}\n" +
            "Height : ${myAquarium.height}\n" +
            "Width:   ${myAquarium.width} ")
}
