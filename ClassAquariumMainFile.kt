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
    println ("myAquareium\n" +
            "Length: ${myAquarium.length}\n" +
            "Height : ${myAquarium.height}\n" +
            "Width:   ${myAquarium.width}\n" +
            "Volume: ${myAquarium.volume()} ")

    //sending params
    val myAquarium2 = Aquarium(30,60,29)
    println ("myAquareium2\n" +
            "Length: ${myAquarium2.length}\n" +
            "Height : ${myAquarium2.height}\n" +
            "Width:   ${myAquarium2.width}\n" +
            "Volume: ${myAquarium2.volume()} ")


    //secondary ctor and default param 
    val myAquarium3 = Aquarium(numberOfFish = 20)
    println ("myAquareium3\n" +
            "Length: ${myAquarium3.length}\n" +
            "Height : ${myAquarium3.height}\n" +
            "Width:   ${myAquarium3.width}\n" +
            "Volume: ${myAquarium3.volume()} ")
}
