import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class User(val name: String, val age: Int)

class JsonHandler {

    // 2nd case
    fun processInput(): String {
        return "Received input - Name: $name, Age: $age"
    }
    // 3rd case
    // Функция, которая создает строку с использованием конструкции и выводит Hello Kotlin!

    fun getUserJson(): String {
        val user = User("John", 30)
        return Json.encodeToString(user)
    }

}
// функции по узнаванию пола, возраста, роста юзера

fun checkUserAge(age: Int): Boolean {
    return age >= 18
}
// 4th case

fun getGender(gender: Char): String {
    return if (gender == 'M') "Male" else "Female"
}


fun main() {
    val jsonHandler = JsonHandler()

    // Пример использования всех функций
    println(jsonHandler.processInput("Alice", 25))
    println(jsonHandler.createString())
    println(jsonHandler.getUserJson())
    println(jsonHandler.checkUserAge(20))
}
