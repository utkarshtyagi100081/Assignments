import java.util.Scanner;
class Armstrong
   {  

  public void checkArmstrong(int number){
      // number is said to be armstrong if its sum of cube of its digits equal to that original number
      int sum =0;int temp= number;
      while(number>0){
        int digit = number%10;
        sum = sum + (digit*digit*digit);
        number=number/10;
      }
       System.out.println(sum);
      if(temp==sum){
          System.out.println("number " + temp + " is armstrong");
      }
      else
      {
          System.out.println("number " + temp + " is  not armstrong");
      }

  }


}

class Main{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = s.nextInt();
        Armstrong arm = new Armstrong();
        arm.checkArmstrong(number);
    }
}