fun main() {
    val obj = object {
        var name: String = "Alex"
        var second_name: String = "Cawton"
        fun Sayhello() {
            println("Hello $name $second_name! We're happy to see you!")
            // Kotlin is one of the most interesting programming languages!
        }
    }
    obj.Sayhello()
}
