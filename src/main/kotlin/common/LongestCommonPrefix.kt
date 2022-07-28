package common

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        val length = strs.size
        for (i in 1 until length) {
            if (prefix.length > strs[i].length) {
                prefix = strs[i]
            }
        }

        for (i in strs.indices) {
            var j = prefix.length
            while (!strs[i].startsWith(prefix) && j >= 0) {
                prefix = prefix.substring(0, j)
                j--
            }
        }
        return prefix
    }

}