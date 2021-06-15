class Solution {
    fun reverse(x: Int): Int {
        var x = x
        var rev = 0
        while (x != 0) {
            val digit = x % 10
            x /= 10
            if (rev > Int.MAX_VALUE / 10 || rev == Int.MAX_VALUE / 10 && digit > 7) return 0
            if (rev < Int.MIN_VALUE / 10 || rev == Int.MIN_VALUE / 10 && digit < -8) return 0
            rev = rev * 10 + digit
        }
        return rev
    }
}


    fun main(arr: Array<String>) {
        val sol = Solution()
        println(sol.reverse(-321))
    }
