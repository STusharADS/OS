package oneto100executor;

public class printnum implements Runnable {
    int i;
    printnum(int i){
        this.i=i;
    }
    public void run(){
        System.out.println(i+" "+Thread.currentThread().getName());
    }
}
