fun main() {
    val numbers = arrayListOf(10, 45, 23, 78, 34)

    var a = numbers[0]
    var b = numbers[1]
    var c = numbers[2]
    var d = numbers[3]
    var e = numbers[4]

    println("a[0]=$a")
    println("a[1]=$b")
    println("a[2]=$c")
    println("a[3]=$d")
    println("a[4]=$e")


    val maxNumber = numbers.max()

    println("largest element: $maxNumber")
}
