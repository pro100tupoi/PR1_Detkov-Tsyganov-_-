fun main() {
    print("Введите два числа и операцию (например: 5 3 +): ")
    val input = readLine()!!

    val numbers = input.split(" ")
    if (numbers.size != 3) {
        println("Неверный формат ввода")
        return
    }

    val num1 = numbers[0].toDouble()
    val num2 = numbers[1].toDouble()
    val operation = numbers[2]

    var result: Double
    when (operation) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> {
            if (num2 == 0.0) {
                println("Деление на ноль")
                return
            }
            result = num1 / num2
        }
        else -> {
            println("Неверная операция")
            return
        }
    }

    println("Результат: $result")
}