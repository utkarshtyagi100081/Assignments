class Pairsum{
    public static void main(String arr[]){
        int [] inputArray= {2,7,4,-5,11,5,20};
        int desiredSum=15;
        // call findPair
        findPair(inputArray,desiredSum);
    }
        public static void findPair(int[] inputArray,int desiredSum){
        for(int i=0; i< inputArray.length;i++){
            if(inputArray[i]==-1)
                continue;
            int secondPair=desiredSum-inputArray[i];
            for (int j=i+1;j<inputArray.length;j++){
                if(secondPair==inputArray[j]){
                    System.out.println("( "+ inputArray[i] + inputArray[j]+" )");
                    inputArray[j]=-1;               
            }
            }
    }
}
}