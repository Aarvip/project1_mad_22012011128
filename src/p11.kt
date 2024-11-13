data class Matrix(val data: Array<IntArray>, val noOfRow: Int, val noOfCol: Int) {

    operator fun plus(other: Matrix): Matrix {
        require(noOfRow == other.noOfRow && noOfCol == other.noOfCol) { "Matrix dimensions must match" }
        return Matrix(
            Array(noOfRow) { row ->
                IntArray(noOfCol) { col ->
                    data[row][col] + other.data[row][col]
                }
            },
            noOfRow,
            noOfCol
        )
    }

    operator fun minus(other: Matrix): Matrix {
        require(noOfRow == other.noOfRow && noOfCol == other.noOfCol) { "Matrix dimensions must match" }
        return Matrix(
            Array(noOfRow) { row ->
                IntArray(noOfCol) { col ->
                    data[row][col] - other.data[row][col]
                }
            },
            noOfRow,
            noOfCol
        )
    }

    operator fun times(other: Matrix): Matrix {
        require(noOfCol == other.noOfRow) { "Number of columns in first matrix must equal number of rows in second matrix" }
        return Matrix(
            Array(noOfRow) { row ->
                IntArray(other.noOfCol) { col ->
                    (0 until noOfCol).sumOf { k -> data[row][k] * other.data[k][col] }
                }
            },
            noOfRow,
            other.noOfCol
        )
    }

    override fun toString(): String {
        return buildString {
            for (row in data) {
                appendLine(row.joinToString(" "))
            }
        }
    }
}

fun main() {
    val firstMatrix = Matrix(
        arrayOf(intArrayOf(3, 2, 5), intArrayOf(3, 0, 4)),
        noOfRow = 2,
        noOfCol = 3
    )

    val secondMatrix = Matrix(
        arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)),
        noOfRow = 3,
        noOfCol = 2
    )

    val secondMatrix1 = Matrix(
        arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)),
        noOfRow = 3,
        noOfCol = 2
    )

    println("***************Addition***************")
    println("Matrix:1 ")
    println(secondMatrix1)
    println("Matrix:2 ")
    println(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")

    println("***************Subtraction***************")
    println("Matrix:1 ")
    println(secondMatrix1)
    println("Matrix:2 ")
    println(secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")

    println("***************Multiplication***************")
    println("Matrix:1 ")
    println(firstMatrix)
    println("Matrix:2 ")
    println(secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication:\n$multiplication")
}