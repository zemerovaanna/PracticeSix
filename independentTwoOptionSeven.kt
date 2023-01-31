fun main()
{
    println( "Введите трёхзначное число:" )
    var x = readLine()!!.toShort()
    println( "Введите a:" )
    var a = readLine()!!.toShort()

    try
    {
        var sot: Int = x / 100
        var des: Int = x / 10 % 10
        var ed: Int = x % 100

        if (sot + des + ed % a == 0)
        {
            println("Кратно.")
        }

        else
        {
            println("Некратно.")
        }
    }
    catch (x: Exception)
    {
        println("Недопустимый ввод.")
    }
}