class Secondmin{
public static void main(String arr[]){
    int element[] = {10,23,5,3,34,28};
    int result = findSecondMin(element);
    System.out.println("second small no is " + result);
    }
public static int findSecondMin(int [] element){
    int min=element[0];
    int nextmin=element[1];
    for(int index=2;index<element.length;index++){
        if(min>nextmin){
            int temp=min;
            min=nextmin;
            nextmin=temp;
        }
        if (min>element[index]){
            nextmin=min;
            min=element[index];
        }
    }
    return nextmin;
    }
}