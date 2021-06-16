import java.util.*
fun main(){
    var apple = mutableListOf<Int>()
    var read = Scanner(System.`in`)
    println("distribute apple :")
    while(true){
        println("enter the apple weight in gram "+ "( enter -1 to stop )")
        var appleWeight = read.nextInt()
        if(appleWeight==-1) break else apple.add(appleWeight)
    }
    var rupees = mutableListOf<Int>(50,30,20)
    var weight= getWeight(apple,rupees)
    distributedApple(weight,apple)
    }
fun getWeight(apple:MutableList<Int>,rupees:MutableList<Int>): MutableList<Int>{
    var totalAppleWeight=0
    var totalRupeesSum =0
    for (apl in apple){
        totalAppleWeight+=apl
    }
    for (rs in rupees){
        totalRupeesSum+=rs
    }
    var weight = mutableListOf<Int>()
    for (rupee in rupees){
        var rupee =rupee.toFloat()
        var percent : Float= ((rupee/totalRupeesSum)*100)
        var weightPerPercent = ((totalAppleWeight.toFloat()*percent)/100).toInt()
        weight.add(weightPerPercent)
    }
    return weight
}
fun distributedApple(weight:MutableList<Int>,apple:MutableList<Int>) {
    for (targetSum in weight){
        var targetSum=targetSum
        var distribute = mutableListOf<Int>()
        apple.sortDescending()
        for (j in 0 until apple.size){
            var firstele = apple.get(0)
            if(targetSum in apple){
                distribute.add(targetSum)
                apple.remove(targetSum)
                targetSum=0
            }
            else if(firstele>targetSum){
                //sort in ascending order
                apple.sort()
                var minWeightEle =0
                for (weight in apple){
                    if(weight>targetSum)
                        minWeightEle=weight
                    break
                }
                distribute.add(minWeightEle)
                apple.remove(minWeightEle)
                targetSum=0
            }
            else {
                targetSum -= firstele
                distribute.add(firstele)
                apple.remove(firstele)
            }
            if(targetSum==0)
                break
        }
        println("distribute result : " + distribute)
    }
}