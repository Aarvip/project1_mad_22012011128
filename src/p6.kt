fun main() {


    val num1 = 111
    val num2 = 2222
    val num3 = -222

     val addition = arithmeticOperation(num1, num2,num3, "add")
    val subtraction = arithmeticOperation(num1, num2,num3, "subtract")
     val multiplication = arithmeticOperation(num1, num2,num3, "multiply")
    val division = arithmeticOperation(num1, num2,num3, "divide")

       println("Addition: $addition")
       println("Subtraction: $subtraction")
         println("Multiplication: $multiplication")
        println("Division: $division")


}


fun arithmeticOperation(num1: Int, num2: Int, num3: Int, operation: String): Int {


    return when (operation) {
        "add" -> num1 + num2 + num3
        "subtract" -> num1 - num2 - num3
        "multiply" -> num1 * num2 * num3
        "divide" -> {
            if (num2.toDouble() != 0.0) {
                num2 / num1
            } else {
                throw IllegalArgumentException("Division by zero is not allowed.")
            }
        }
        else -> throw IllegalArgumentException("Unsupported operation: $operation")
    }
}
