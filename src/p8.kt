fun main() {
    val numbers = arrayOf(10, 90, 60, 80, 100)
    println("using array of:")
    println(numbers.joinToString())

    val numbers1 = Array<Int>(5) { 0 }
    println("using array<>() of:")
    println(numbers1.joinToString())

    val numbers2 = Array<Int>(8) { it }
    println("using array<>() lambda function of:")
    println(numbers2.joinToString())

    val numbers3 = IntArray(5)
    println("using IntArray of:")
    println(numbers3.joinToString())

    val numbers4 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("using intArrayOf of:")
    println(numbers4.joinToString())

    val numbers5 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("using array-6 by using arrayof()")
    println(numbers5.contentDeepToString())

    fun main() {
        val numbers6 = intArrayOf(56, 23, 49, 12, 2)
        for (i in numbers6.indices) {
            println("a[$i] = ${numbers6[i]}")
        }

    }

    print("*")


    val numbers7 = intArrayOf(56, 23, 49, 12, 2)
    for (i in numbers7.indices) {
        println("a[$i] = ${numbers7[i]}")
    }
    println("Array elements: ${numbers7.joinToString(", ")}")

    print("**without using built in function ")

    val numbers8 = IntArray(5)
    numbers8[0] = 56
    numbers8[1] = 23
    numbers8[2] = 49
    numbers8[3] = 12
    numbers8[4] = 2
    for (i in numbers8.indices) {
        println("a[$i] = ${numbers8[i]}")
    }
    println("Array elements: ${numbers8.joinToString(", ")}")

}