package Extend;

public class Printer extends Thread {


        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("child "+i);
            }
        }


}
