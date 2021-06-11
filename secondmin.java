class small{
public static void main(String arr[]){

    int element[] = {10,23,5,3,34,28};
    int min=element[0];
   int nextmin=element[1];
    for(int i=2;i<element.length;i++){
        if(min>nextmin){
            int temp=min;
            min=nextmin;
            nextmin=temp;
        }
        if (min>element[i]){
            nextmin=min;
            min=element[i];
        }
    }
    System.out.println("first small no is " + min + " second small number is " + nextmin);
}


}