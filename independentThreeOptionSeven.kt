fun main()
{
    println( "Введите температуру:" )
    var x = readLine()!!.toShort()
    try
    {
        if ( x > 60 )
        {
            println("Пожарная ситуация!")
        }
        else
        {
            println("Всё впорядке.")
        }
    }
    catch (x: Exception)
    {
        println("Недопустимый ввод.")
    }
}