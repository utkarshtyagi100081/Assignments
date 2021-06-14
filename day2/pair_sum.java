import java.util.Scanner;
import java.util.ArrayList;

class pair2Sum{
    public static void main(String arr[]){
        ArrayList<Integer> a =new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        
        for (int j=0; j<size;j++){
            System.out.println("Enter the element "+ (j+1) + " ");
            int ele = input.nextInt();
            a.add(ele);
        }
        System.out.println("Enter the desired sum");
        int desiredSum= input.nextInt();
        for(int i=0; i< a.size();i++){
            if(a.get(i)==null){
                continue;
            }
            int temp=desiredSum-a.get(i);
            for (int k=i+1;k<a.size();k++){
               try{ if(temp==(a.get(k))){
                    System.out.println("( "+ a.get(i) +" "+ a.get(k)+" )");
                    a.set(k,null);
                }}catch(NullPointerException e){
                    //System.out.println(e);
                }
            }

        }

    }
}