package common

class FizzBuzz {

    fun fizzBuzz(n: Int): List<String> {
        if (n == 1) return listOf("1")
        if (n == 2) return listOf("1", "2")
        val answer = mutableListOf("1", "2")
        for (i in 3..n) {
            var isDivBy3 = i % 3 == 0
            var isDivBy5 = i % 5 == 0
            if (isDivBy3 && isDivBy5) {
                answer.add("FizzBuzz")
            } else if (isDivBy3) {
                answer.add("Fizz")
            } else if (isDivBy5) {
                answer.add("Buzz")
            } else {
                answer.add("$i")
            }
        }
        return answer
    }
}