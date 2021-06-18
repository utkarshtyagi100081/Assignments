class ReverseInteger {
    fun reverse(number: Int): Int {
        var number = number
        var reverse = 0
        while (number != 0) {
            val digit = number % 10
            number /= 10
            if (reverse > Int.MAX_VALUE / 10 || reverse == Int.MAX_VALUE / 10 && digit > 7) return 0
            if (reverse < Int.MIN_VALUE / 10 || reverse == Int.MIN_VALUE / 10 && digit < -8) return 0
            reverse = reverse * 10 + digit
        }
        return reverse
    }
}
fun main(arr: Array<String>) {
     val obj_reverse_integer = ReverseInteger()
    println(obj_reverse_integer.reverse(-321))
}
