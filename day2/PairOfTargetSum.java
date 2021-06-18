import java.util.Scanner;
import java.util.ArrayList;

class PairOfTargetSum{
    public static void main(String arr[]){
        ArrayList<Integer> array =new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        // get the array element from user
        for (int j=0; j<size;j++){
            System.out.println("Enter the element "+ (j+1) + " ");
            int ele = input.nextInt();
            array.add(ele);
        }
        System.out.println("Enter the desired sum");
        int desiredSum= input.nextInt();
        // call function getPair
        getPair(array,desiredSum);
    }
    public static void getPair(ArrayList<Integer> array,int desiredSum){
        for(int firstele=0; firstele< array.size();firstele++){
            if(array.get(firstele)==null)//skip the null element 
                continue;
            int desiredElement=desiredSum-(array.get(firstele));
            for (int secondele=firstele+1;secondele<array.size();secondele++){
               try{ if(desiredElement==(array.get(secondele))){
                    System.out.println("( "+ array.get(firstele) +" "+ array.get(secondele)+" )");
                    array.set(secondele,null);// set the null to second pair element 
                }}catch(NullPointerException e){
                    //System.out.println(e);
                }
            }
        }
    }
}