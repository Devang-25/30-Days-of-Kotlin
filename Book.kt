package Book

open class Book (open val title:String,open val author:String)
{
    private var currentPage:Int = 1
    open fun readPage()
    {
        currentPage++
    }

}

//inheritance when the base class does not have default param
class eBook (title: String,author: String,val format:String = "text") : Book(title,author)
{
    private var wordsRead:Int=0
    override fun readPage()
    {
        wordsRead+=250
    }
}

