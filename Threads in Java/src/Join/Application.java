package Join;

public class Application {
    public static void main(String args[]){
        Printer printer=new Printer();
        Thread thread=new Thread(printer);
        thread.start();

        //Main thread wait till child thread execute


        try {
            //Main thread wait till child execute
            //thread.join(2000);

            //Main thread wait 2000 miliseconds till child thread complete after time limit it execute
            thread.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < 50; i++) {
            System.out.println("Main "+Thread.currentThread().getName()+i);
        }

        System.out.println("***********************************");
    }

}
