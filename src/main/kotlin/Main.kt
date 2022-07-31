import common.LongestCommonPrefix
import common.RemoveDuplicatesFromSortedArray


fun main(args: Array<String>) {


    var intArray = intArrayOf(
        1,1,2
    )
    println(
        "size: ${RemoveDuplicatesFromSortedArray().removeDuplicates(
            intArray
        )}, array:${intArray.joinToString()}"
    )

}