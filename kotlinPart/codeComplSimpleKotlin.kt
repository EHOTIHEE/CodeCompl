class Example {

    // Функция с входными параметрами
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // 7th
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    // 8th
    // сase with if elase structure to check number for positive or negative
    fun isPositive(num: Int): Boolean {
    }

    fun isEven(num: Int): Boolean {
        return if (num % 2 == 0) {
            true
        } else {
            false
        }
    }

    // 12th 
    fun greet() {
        println("")
    }

    // 9th
    fun countdown(start: Int) {
        var i = start
    }

    fun countdownWithMessage(start: Int) {
        var i = start
        while (i > 0) {
            println("До старта осталось $i секунд")
            i--
        }
        println("Запуск завершён!")
    }
}
