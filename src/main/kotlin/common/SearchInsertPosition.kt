package common

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var begin = 0
        var end = nums.size - 1
        var index = -1
        while (begin <= end) {
            val mid = (begin + end) / 2
            if (nums[mid] == target) {
                index = mid
                end = mid - 1
            } else if (target > nums[mid]) {
                begin = mid + 1
            } else if (target < nums[mid]) {
                end = mid - 1
            }
        }
        return begin
    }
}