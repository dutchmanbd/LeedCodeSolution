package common

class AddBinary {

    fun addBinary(a: String, b: String): String {
//        val binaryA = a.toBigInteger(2)
//        val binaryB = b.toBigInteger(2)
//
//        val sum = binaryA + binaryB
//        return sum.toString(2)

        var result = ""
        var hand = '0'
        var aIndex = a.length - 1
        var bIndex = b.length - 1
        while (aIndex >= 0 && bIndex >= 0) {
            if (a[aIndex] == '1' && b[bIndex] == '1') {
                result = "0$result"
                hand = '1'
            } else if ((a[aIndex] == '1' || b[bIndex] == '1') && hand == '1') {
                result = "0$result"
                hand = '1'
            } else {
                val lastBit = if (a[aIndex] == '1' || b[bIndex] == '1') {
                    '1'
                } else if (hand == '1') {
                    '1'
                } else {
                    '0'
                }
                result = "$lastBit$result"
                hand = '0'
            }
            aIndex--
            bIndex--
        }

        while (aIndex >= 0) {
            if (a[aIndex] == '1' && hand == '1') {
                result = "0$result"
                hand = '1'
            } else {
                val lastBit = if (a[aIndex] == '1') {
                    '1'
                } else if (hand == '1') {
                    '1'
                } else {
                    '0'
                }
                result = "$lastBit$result"
                hand = '0'
            }
            aIndex--
        }

        while (bIndex >= 0) {
            if (b[bIndex] == '1' && hand == '1') {
                result = "0$result"
                hand = '1'
            } else {
                val lastBit = if ( b[bIndex] == '1') {
                    '1'
                } else if (hand == '1') {
                    '1'
                } else {
                    '0'
                }
                result = "$lastBit$result"
                hand = '0'
            }
            bIndex--
        }

        if (hand == '1') {
            result = "1$result"
        }
        return result
    }
}