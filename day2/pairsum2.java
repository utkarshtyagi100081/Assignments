import java.util.*;

class pairSum2{

 static boolean checkSum(int a[],int sum,int size){
     int l=0;int r=size-1;
     Arrays.sort(a);
     while(l<r){
         if (a[l]+a[r]==sum){
             return true;
         }
         else if((a[l]+a[r])>sum){
             r--;
         }
         else{
             l++;
         }


     }
    return false;

 }

public static void main(String arr[]){
    int a[] = {1,4,45,6,10,-8};
    int n= 16;
    int size=a.length;
    if(checkSum(a,n,size)){
        System.out.println("founded");
    }
    else{
        System.out.println(" not founded");
    }
}




}