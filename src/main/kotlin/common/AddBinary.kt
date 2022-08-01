package common

class AddBinary {

    fun addBinary(a: String, b: String): String {
        val binaryA = a.toBigInteger(2)
        val binaryB = b.toBigInteger(2)

        val sum = binaryA + binaryB
        return sum.toString(2)
    }
}