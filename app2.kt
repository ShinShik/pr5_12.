import kotlin.math.pow
fun main(){
    try {
        println("Введите число от 0 до 9")
        var a = readLine()!!.toInt()
        when(a){
            1->println("один")
            2->println("два")
            3->println("три")
            4->println("четыре")
            5->println("пять")
            6->println("шесть")
            7->println("семь")
            8->println("восемь")
            9->println("девять")
            else->println("Неверный ввод")
        }
    }
    finally {
        println("Введено неверное значение")
    }
}