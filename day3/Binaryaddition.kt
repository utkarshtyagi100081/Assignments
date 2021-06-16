import java.util.Scanner

fun getDecimal(binaryNumber: Long) : Int{
    var binaryNumber=binaryNumber
    var decimal=0
    var power=0
    while(binaryNumber>0){
        val reminder = binaryNumber%10
        decimal=decimal+(reminder*(Math.pow(2.0,power.toDouble()))).toInt()
        binaryNumber/=10
        power++
    }
    return decimal
}
fun main(){
    val read =Scanner(System.`in`)
    println("enter the first binary number")
    val binaryNumber1: Long = read.nextLong()
    println("enter the second binary number")
    var binaryNumber2 : Long= read.nextLong()
    // convert number into decimal
    var decimal1 = getDecimal(binaryNumber1)
    var decimal2 = getDecimal(binaryNumber2)
    var result: Int = decimal1+decimal2
    // convert result into binary
    println((Integer.toBinaryString(result)))
}