public class client{
    public static void main(String args[]){
        // System.out.println("hello "+ Thread.currentThread().getName());

        HelloWorldPrinter obj=new HelloWorldPrinter();
        Thread t=new Thread(obj);
        t.start();
    }
}