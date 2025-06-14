package oneto100diffthreads;

public class client {
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            printnum obj=new printnum(i);
            Thread t=new Thread(obj);
            t.start();
        }
    }
}
