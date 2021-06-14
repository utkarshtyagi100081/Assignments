class pairSum{
    public static void main(String arr[]){
        int [] a= {2,7,4,-5,11,5,20};
        int desiredSum=15;
        for(int i=0; i< a.length;i++){
            if(a[i]==-1){
                continue;
            }
            int temp=desiredSum-a[i];
            for (int j=i+1;j<a.length;j++){
                if(temp==a[j]){
                    System.out.println("( "+ a[i] + a[j]+" )");
                    a[j]=-1;
                }
            }

        }

    }
}