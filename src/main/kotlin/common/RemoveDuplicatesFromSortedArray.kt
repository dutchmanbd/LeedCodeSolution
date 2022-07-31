package common

class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val dic = mutableMapOf<Int, Int>()
        val resultArray = mutableListOf<Int>()
        val length = nums.size
        for (index in 0 until length) {
            val n = nums[index]
            if (!dic.containsKey(n)) {
                resultArray.add(n)
            }
            dic[n] = 1
        }
        var index = 0
        for(n in resultArray){
            nums[index++] = n
        }
        return resultArray.size
    }

}