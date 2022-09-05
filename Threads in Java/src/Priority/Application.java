package Priority;



public class Application {
    public static void main(String[] args) {





        //******************** Thread Priority****************************
        //way 1-create thread instance
        //Thread thread1=new Thread();

        //way 2-use runnable interface and pass it through thread instance
        //Printer printer=new Printer();
       // Thread thread=new Thread(printer);

        //way 3-pass a name to thread
        //Thread thread3=new Thread("fff");

        //way4-pass runnable implemented instance and give a name
        //Thread thread4=new Thread(printer, "name");

        //way5-using thread group
        //Thread thread5=new Thread(new ThreadGroup(),"add");

        //way6-using thread group and
        //Thread thread6=new Thread(new ThreadGroup(), printer);

        //way7-using thread group and
        //Thread thread7=new Thread(new ThreadGroup(), "add", "name");

        //way8-using thread group and
        //Thread thread8=new Thread(new ThreadGroup(), printer, "name","_stack size_");

        Printer printer =new Printer();
        Thread thread=new Thread(printer);
        thread.start();

        //thread.setPriority(10);

        System.out.println("Main"+Thread.currentThread().getPriority());
        System.out.println("Child"+thread.getPriority());


        for (int i = 0; i < 50; i++) {
            System.out.println("Main "+Thread.currentThread().getName()+i);
        }

        System.out.println("***********************************");
    }
}
