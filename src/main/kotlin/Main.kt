import convert.StringToInt

fun main(args: Array<String>) {

//    print(ReverseInteger().reverse(10))
    println(StringToInt().myAtoi("+-12"))
    println(StringToInt().myAtoi("-91283472332"))
    println(StringToInt().myAtoi("0000-432a323"))
    println(StringToInt().myAtoi("   00000000000012345678"))
}