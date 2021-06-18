import java.util.Scanner;
fun main()
{
    //implementing linear search algorithm
    //  input  array from user
    val input =Scanner(System.`in`)
    println("enter the size of array")
    val size=input.nextInt()
    var array = Array(size){0}
    println("enter the  array element")
    for(position in 0 until size){
        val inputelement = input.nextInt()
        array.set(position,inputelement)
    }
    println("enter the element to be search")
    val element = input.nextInt()
    // object of linearSearch class

    val found = LinearSearch()
    found.search(array,size,element)
}
class LinearSearch{

    var flag = false // set flag false initally
    fun search(array: Array<Int>, size:Int, element:Int){
        for ( inputelement in array.indices){
            if(array[inputelement]==element){
                println("$element found at position ${inputelement+1}")
                break
            }else{
                flag = true// element not found then set it true
            }
        }
        if(flag){ println("$element not found")}
    }
}