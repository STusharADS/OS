package oneto100executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String args[]){
        ExecutorService ex= Executors.newFixedThreadPool(5);
        for(int i=0;i<100;i++){
            printnum obj=new printnum(i);
            ex.execute(obj);
        }
        ex.shutdown();
    }
}
