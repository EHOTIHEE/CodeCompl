interface Animal {
    fun makeSound()
    fun move()
}

class Dog : Animal {
    //18th

    override fun move() {
        println("Dog is running.")
    }
}

class Cat : Animal {
    override fun makeSound() {
        println("Meow meow!")
    }

    override fun move() {
        println("Car is jumping.")
    }
}

fun main() {
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    dog.makeSound()
    dog.move()

    cat.makeSound()
    cat.move()
}
