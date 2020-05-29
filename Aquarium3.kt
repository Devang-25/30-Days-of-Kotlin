package Aquarium

//declaring a class with default constructor THE KOTLIN WAY
class Aquarium (var length:Int=100,var width:Int=20,var height:Int=40){
    fun volume() =  length * height * width / 1000
}
