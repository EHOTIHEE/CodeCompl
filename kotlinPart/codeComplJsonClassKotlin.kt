import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class User(val name: String, val age: Int)

class JsonHandler {

    // Функция, принимающая параметры и работающая с ними
    fun processInput(name: String, age: Int): String {
        return "Received input - Name: $name, Age: $age"
    }

    // Функция, которая создает строку с использованием конструкции
    fun createString(): String {
        return "This is a string constructed with \"quotes\""
    }

    // Функция, которая возвращает значение
    fun getUserJson(): String {
        val user = User("John", 30)
        return Json.encodeToString(user)
    }

    // Функция с условием if/else
    fun checkUserAge(age: Int): String {
        return if (age >= 18) {
            "User is an adult."
        } else {
            "User is a minor."
        }
    }
}

fun main() {
    val jsonHandler = JsonHandler()

    // Пример использования всех функций
    println(jsonHandler.processInput("Alice", 25))
    println(jsonHandler.createString())
    println(jsonHandler.getUserJson())
    println(jsonHandler.checkUserAge(20))
}
