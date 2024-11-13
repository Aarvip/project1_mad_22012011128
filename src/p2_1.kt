fun main() {
    val intValue: Int = 10
    val doubleValue: Double = intValue.toDouble()
    println("Double: $doubleValue")

    val stringValue: String = "42"
    val intValueFromString: Int = stringValue.toInt()
    println("Int: $intValueFromString")

    val doubleValueFromString: Double = stringValue.toDouble()
    println("Double: $doubleValueFromString")
}
