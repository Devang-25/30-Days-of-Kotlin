package Aquarium

//declaring a class with constructor
class Aquarium (length:Int, width:Int, height:Int){
    var length = length
    var width = width
    var height = height


    fun volume() =  length * height * width / 1000
}
