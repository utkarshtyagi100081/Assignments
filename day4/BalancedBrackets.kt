import java.util.*

class BalancedBrackets {
    // function to check if brackets are balanced
    fun areBracketsBalanced(expr: String): Boolean {
        // Using ArrayDeque
        val stack: Deque<Char> = ArrayDeque()

        // Traversing the Expression
        for (i in 0 until expr.length) {
            val x = expr[i]
            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x)
                continue
            }

            // If current character is not opening
            // bracket, then it must be closing.
            // So stack must not be empty
            if (stack.isEmpty()) return false
            var check: Char
            when (x) {
                ')' -> {
                    check = stack.pop()
                    if (check == '{' || check == '[') return false
                }
                '}' -> {
                    check = stack.pop()
                    if (check == '(' || check == '[') return false
                }
                ']' -> {
                    check = stack.pop()
                    if (check == '(' || check == '{') return false
                }
            }
        }

        // Check Empty Stack
        return stack.isEmpty()
    }
}

    fun main(args: Array<String>) {
        val expr = "([{}])"
        val obj = BalancedBrackets()


        // Function call
        if (obj.areBracketsBalanced(expr)) println("Balanced ") else println("Not Balanced ")
    }
