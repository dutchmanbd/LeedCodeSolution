import common.RangeSumQuery
import common.SearchInsertPosition


fun main(args: Array<String>) {

//    println(
//        SearchInsertPosition()
//            .searchInsert(intArrayOf(1, 2, 3, 4), 5)
//    )
//
//    println(
//        SearchInsertPosition()
//            .searchInsert(intArrayOf(1, 2, 3, 4), 3)
//    )
//
//    println(
//        SearchInsertPosition()
//            .searchInsert(intArrayOf(1, 2, 3, 4), 1)
//    )
//
//    println(
//        SearchInsertPosition()
//            .searchInsert(intArrayOf(1, 2, 4, 5), 3)
//    )

    println(
        RangeSumQuery(intArrayOf(1,3,5)).sumRange(0, 2)
    )

    println(
        RangeSumQuery(intArrayOf(1,3,5)).update(1, 2)
    )
    println(
        RangeSumQuery(intArrayOf(1,3,5)).sumRange(0, 2)
    )
}