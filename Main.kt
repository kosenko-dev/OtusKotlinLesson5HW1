fun square(x: Int): Int {
    return x * x
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val transformedNumbers = transformCollection(numbers, ::square)
    println(transformedNumbers) // вернется: [1, 4, 9, 16, 25]
}

fun transformCollection(numbers: List<Int>, f: (Int) -> Int): Any = numbers.map(f).toList()