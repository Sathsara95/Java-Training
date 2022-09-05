package Yield_Sleep_Interrupt;


public class Application {
    public static void main(String[] args){
        Printer print=new Printer();
        Thread thread=new Thread(print);
        thread.start();


        for(int i=0;i<=50;i++){
            System.out.println("Main"+" "+Thread.currentThread().getName()+" "+i);
        }
        thread.interrupt();
    }
}
