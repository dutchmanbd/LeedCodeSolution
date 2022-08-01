package common

class RangeSumQuery(nums: IntArray) {
    val nums = nums
    fun update(index: Int, `val`: Int) {
        nums[index] = `val`
    }

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        for(index in left..right){
            sum += nums[index]
        }
        return sum
    }

}