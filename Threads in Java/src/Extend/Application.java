package Extend;

public class Application {

        public static void main(String[] args) {

            //Thread instance created
            Printer printer=new Printer();

            //set thread instance to the thread pool
            printer.start();

            for (int i = 0; i < 50; i++) {
                System.out.println("Main "+Thread.currentThread().getName()+i);
            }

            System.out.println("***********************************");
        }


}
