package common

import java.util.*

class ValidParentheses {

    fun isValid(s: String): Boolean {
        val length = s.length
        if (length == 1) return false
        val stack = Stack<Char>()

        for (index in 0 until length) {
            if (s[index] == '(' || s[index] == '{' || s[index] == '[') {
                stack.add(s[index])
            }
            if (s[index] == ')' || s[index] == '}' || s[index] == ']') {
                if(stack.isEmpty()){
                    return false
                }
                val lastChar = stack.pop()
                if (lastChar == '(' && s[index] != ')') {
                    return false
                } else if (lastChar == '{' && s[index] != '}') {
                    return false
                } else if (lastChar == '[' && s[index] != ']') {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

}