public class HelloWorldPrinter implements Runnable{
    public void run(){
        System.out.println("hello world"+  " Thread :"+Thread.currentThread().getName());
    }
}