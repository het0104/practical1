fun main() {
    val numbers = arrayListOf(10, 25, 8, 45, 32)
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }

    println("Max number = $max")
}