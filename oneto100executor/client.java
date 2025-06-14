package oneto100executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String args[]){
        // ExecutorService ex= Executors.newFixedThreadPool(5);
        ExecutorService ex=Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
            printnum obj=new printnum(i);
            ex.execute(obj);
        }
        ex.shutdown();
    }
}
