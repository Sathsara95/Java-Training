package Implement;

public class Application {

    public static void main(String[] args) {

        Printer printer=new Printer();
        Thread thread=new Thread(printer);
        thread.start();


        for (int i = 0; i < 50; i++) {
            System.out.println("Main "+Thread.currentThread().getName()+i);
        }

        System.out.println("***********************************");
    }


}

