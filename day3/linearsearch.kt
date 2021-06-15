import java.util.Scanner;
fun main()
{
    //implementing linear search algorithm
    // take input a array from user
    val input =Scanner(System.`in`)
    println("enter the size of array")
    val size=input.nextInt()
    var array = Array(size){0}
    println("enter the  array element")
    for(i in 0 until size){
        val ele = input.nextInt()
        array.set(i,ele)
    }
    println("enter the element to be search")
    val element = input.nextInt()
    // object of linearSearch class

    val found = LinearSearch()
    found.search(array,size,element)
}
class LinearSearch{

    var flag = false // set flag false initally

    fun search(a: Array<Int>, size:Int, element:Int){
        for ( ele in a.indices){
            if(a[ele]==element){

                println("$element found at position ${ele+1}")
                break
            }else{
                var flag = true// element not found then set it true
            }
        }

        if(flag){ println("$element not found")}
    }
}