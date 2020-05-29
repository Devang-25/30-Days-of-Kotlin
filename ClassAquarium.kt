package Aquarium

//declaring a class with default constructor THE KOTLIN WAY
class Aquarium (var length:Int=100,var width:Int=20,var height:Int=40){
    fun volume() =  length * height * width / 1000

    var water:Double = volume() * 0.9

    //secondary ctor
    constructor(numberOfFish:Int):this()
    {
        var water:Int = numberOfFish * 2000  //in cubic cm
        val tank:Double = water + water * 0.1
        height = (tank/(length*width)).toInt()
    }
}
