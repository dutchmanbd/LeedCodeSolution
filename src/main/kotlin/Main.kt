import common.RansomNote


fun main(args: Array<String>) {

    println(RansomNote().canConstruct("a", "b"))
    println(RansomNote().canConstruct("aa", "ab"))
    println(RansomNote().canConstruct("aa", "aab"))

}