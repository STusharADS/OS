package oneto100diffthreads;

public class printnum implements Runnable {
    int i;
    printnum(int i){//constructor
        this.i=i;
    }
    public void run(){
        System.out.println(i+" "+Thread.currentThread().getName());
    }
}
