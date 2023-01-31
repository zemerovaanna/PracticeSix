import kotlin.math.*
fun main()
{
    println( "Введите x:" )
    var x = readLine()!!.toFloat()

    try
    {
        if ( x > 3 )
        {
            println( -3 * x + 9 )
        }

        else if ( x <= 3 )
        {
            print( x.pow(3 ) / ( x.pow(2)+8 ) )
        }
    }
    catch (x: Exception)
    {
        println("Недопустимый ввод.")
    }
}