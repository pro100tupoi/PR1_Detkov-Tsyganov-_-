fun main() {
    print("Введите натуральное число: ")
    val number = readLine()!!.toInt()

    if (number < 0) {
        println("Ошибка: введите натуральное число.")
        return
    }

    var binaryNumber = ""
    var remainingNumber = number

    while (remainingNumber > 0) {
        binaryNumber = (remainingNumber % 2).toString() + binaryNumber
        remainingNumber /= 2
    }

    println("Двоичное представление числа $number: $binaryNumber")
}