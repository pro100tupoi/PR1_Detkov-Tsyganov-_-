fun main() {
    print("Введите первое число: ")
    val num1 = System.console().readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = System.console().readLine()!!.toInt()

    val operations = listOf(num1 + num2, num1 - num2, num1 * num2)

    for (result in operations) {
        if (result % 2 != 0) {
            println("Нечетное число: $result")
            return
        }
    }

    println("Создать нечетное число невозможно")
}