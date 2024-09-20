fun main() {
    print("Введите строку: ")
    val input = readLine()!!
    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        if (char in charCount) {
            charCount[char] = charCount[char]!! + 1
        } else {
            charCount[char] = 1
        }
    }

    val sortedChars = charCount.keys.sorted()
    for (char in sortedChars) {
        println("$char - ${charCount[char]}")
    }
}