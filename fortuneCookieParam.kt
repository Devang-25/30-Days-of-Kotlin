import java.util.*

fun getFortuneCookie(birthday: Int) : String
{
    var listOfFortune = listOf(
            "You will have a great day!" ,
            "Things will go well for you today." ,
            "Enjoy a wonderful day of success." ,
            "Be humble and all will turn out well." ,
            "Today is a good day for exercising restraint." ,
            "Take it easy and enjoy life!" ,
            "Treasure your friends because they are your greatest fortune.")

    return listOfFortune[birthday%7]


}

fun getBirthday () : Int
{
    var birthday =1
    print("Enter your birthday")
    birthday = readLine()?.toIntOrNull() ?: 1 //put 1 in birthday if the value is not correct
    return birthday
}

fun main (args: Array<String>)
{
    var fortune : String = getFortuneCookie(getBirthday())
    print (fortune)
}

