package common

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val length = nums.size
        val map = mutableMapOf<Int, Int>()
        for (index in 0 until length) {
            val currentNumber = nums[index]
            val requiredNumber = target - currentNumber
            if (map.containsKey(requiredNumber)) {
                return intArrayOf(map[requiredNumber]!!, index)
            }
            map[currentNumber] = index
        }
        return intArrayOf()
    }

}