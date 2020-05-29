package Aquarium

import kotlin.math.PI

//declaring a class with default constructor THE KOTLIN WAY
//class is kept open so that the class can be inherited

open class Aquarium (var length:Int=100,var width:Int=20,var height:Int=40){
    open fun volume() =  length * height * width / 1000

    open var water:Double = volume() * 0.9

    constructor(numberOfFish:Int):this()
    {
        var water:Int = numberOfFish * 2000  //in cubic cm
        val tank:Double = water + water * 0.1
        height = (tank/(length*width)).toInt()
    }
}

//inheriting from aquarium
class towerTank : Aquarium()
{
    override var water = volume() *0.0
    var volume:Int
    get() = (width * height * length/1000 * PI).toInt()
    set(value)
    {
        height=((value*1000) /(width*length))
    }



}
