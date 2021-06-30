class Hi extends Thread{

    public void run(){
           int n=10;
        while(n!=0){
        System.out.println("hi");
       try{ Thread.sleep(1000);}catch(Exception e){}
        n=n-1;
    }
}
}
class Hello extends Thread{

    public void run(){
        int n=10;
        while(n!=0){
        System.out.println("hello");
        try{ Thread.sleep(1000);}catch(Exception e){}
        n=n-1;
    }
    }
}

class ThreadDemo{
    public static void main(String arr[])
    {
        Hi obj1=new Hi();
    Hello obj2 = new Hello();
    obj1.start();
    try{ Thread.sleep(10);}catch(Exception e){}
    obj2.start();
    
    
    }
}