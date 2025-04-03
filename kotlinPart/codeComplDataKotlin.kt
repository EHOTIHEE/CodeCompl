class DataProcessor {
    
    
    //15th
    fun processData() {
        when (input) {
            is Int -> println("Целое число: ${input * 2}")
            is String -> println("Строка в верхнем регистре: ${input.uppercase()}")
            is Boolean -> println("Булево значение: ${if (input) "Да" else "Нет"}")
            else -> println("Неизвестный тип данных")
        }
    }
    // 10th 
    fun printSquares(limit: Int) {
        println("squares of numbers from 1 to $limit:")
    }

    fun printEvenNumbers(limit: Int) {
        println("Четные числа от 1 до $limit:")
        for (i in 1..limit) {
            if (i % 2 == 0) {
                println()
            }
        }
    }
}

fun main() {
    val dataProcessor = DataProcessor()

    dataProcessor.processData(10)
    dataProcessor.processData("hello")
    dataProcessor.processData(true)
    dataProcessor.processData(3.14)

    dataProcessor.printSquares(5)
    dataProcessor.printEvenNumbers(10)
}
