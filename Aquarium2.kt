package Aquarium

//declaring a class with default constructor
class Aquarium (length:Int=100, width:Int=20, height:Int=40){
    var length = length
    var width = width
    var height = height


    fun volume() =  length * height * width / 1000
}
