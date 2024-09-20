fun main() {
    print("Введите целое число n: ")
    val n = readLine()!!.toInt()
    print("Введите основание степени x: ")
    val x = readLine()!!.toInt()

    var y = 0
    var result = 1
    while (result < n) {
        y++
        result *= x
    }

    if (result == n) {
        println("Целочисленный показатель степени: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}