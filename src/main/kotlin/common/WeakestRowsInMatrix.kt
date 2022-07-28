package common

class WeakestRowsInMatrix {

    private fun numOfOnes(row: IntArray): Int {
        var low = 0
        var high = row.size
        while (low < high) {
            val mid = low + (high - low) / 2
            if (row[mid] == 1) low = mid + 1
            else high = mid
        }
        return low
    }

    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val rows = mat.size
        val scores = IntArray(rows)
        for (i in 0 until rows) {
            val sold = numOfOnes(mat[i])
            scores[i] = sold * rows + i
        }
        scores.sort()
        for (i in 0 until k) {
            scores[i] = scores[i] % rows
        }
        return scores.copyOfRange(0, k)
    }
}