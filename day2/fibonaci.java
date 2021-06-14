import java.util.Scanner;
import java.util.Arrays;
class fib{
    int a=0,b=1,c;
    
    public int[] fibonaci(int [] arr1,int number)
    {
        arr1[0]=a;arr1[1]=b;
        for(int i=2;i<=number;i++)
        {
            c=a+b;
            a=b;
            b=c;
            arr1[i]=c;
        }
        return arr1;
    }




}
// 0 1 1 2 3 5 8 13

class Main{
    public static void main(String arr[]){
        fib b = new fib();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int number= s.nextInt();
        int [] arr1= new int[number*2];
        int[] result= b.fibonaci(arr1,number);
        // print using arrays to string method
        System.out.println("fibonaci series till number"+ number+"is" +Arrays.toString(result));
        // for(int val: result){
        //     System.out.println(val);
        // }
    }
}