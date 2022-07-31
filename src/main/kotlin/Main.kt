import common.RemoveElement

fun main(args: Array<String>) {

    val nums = intArrayOf(0,1,2,2,3,0,4,2)
    val dc = RemoveElement().removeElement(
        nums, 2
    )
    print("$dc, nums = ")
    for (index in 0 until dc) {
        print("${nums[index]},")
    }
}