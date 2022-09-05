package Yield_Sleep_Interrupt;



public class Printer implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            //Yield method
            //Thread.yield();

            try {
                //using sleep method
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("child "+i);
        }

    }
}
