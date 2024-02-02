import kotlin.math.pow
fun main(){
    try {
        var a = readLine()!!.toDouble()
        var b = readLine()!!.toDouble()
        when{
            (a>b)->(println(++a))
            (a<b)->(println(++b))
            (a==b)->(println(b.pow(3)))
            else -> println("ERROR")
        }
    }
    finally {
        println("Введено неверное значение")
    }
}