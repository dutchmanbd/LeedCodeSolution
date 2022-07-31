package common

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        val resultArray = mutableListOf<Int>()
        val length = nums.size
        for (index in 0 until length) {
            val n = nums[index]
            if (n != `val`) {
                resultArray.add(n)
            }
        }
        var index = 0
        for (n in resultArray) {
            nums[index++] = n
        }
        return resultArray.size
    }

}