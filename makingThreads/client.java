package makingThreads;

public class client{
    public static void main(String args[]){

        HelloWorldPrinter obj=new HelloWorldPrinter();
        Thread t=new Thread(obj); 
        
        System.out.println(" 0 hello "+ Thread.currentThread().getName());

        
        t.start();
    }
}