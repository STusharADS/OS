package makingthreads;

public class HelloWorldPrinter implements Runnable{
    public void dosomething(){
        System.out.println(" 2 heeloo for thread " +" Thread  : " + Thread.currentThread().getName()) ;
    }
    
    public void run(){
        System.out.println(" 1 hello world"+  " Thread :"+Thread.currentThread().getName());
        dosomething();
    }
}