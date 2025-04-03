class Example {

    // Функция с входными параметрами
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // Ещё одна функция с входными параметрами
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

    // Простая функция без параметров
    fun greet() {
        println("Привет, мир!")
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
