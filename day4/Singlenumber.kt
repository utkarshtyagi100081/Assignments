import java.util.*

fun main(){
    val read = Scanner(System.`in`)
    println("enter the size")
    val size = read.nextInt()
   val array = IntArray(size)
    println("enter elements")
  for(index in 0 until size){
      array[index]=read.nextInt()
  }
    val result = singleNumber(array)
    println(result)
}
fun singleNumber(array: IntArray):Int{
    var firstElement= array[0]
    for(index in 1 until array.size){
        firstElement=(firstElement) xor (array[index])
    }
    return firstElement
}