public class Application {
    public static void main(String args[]){


        long start;
        long end;

        //let's get 1st instance
        ConfigManager confManager=ConfigManager.getConfigManager();
        System.out.println(confManager);

        start=System.currentTimeMillis();
        String configMessage=confManager.getConfiguration();
        end=System.currentTimeMillis();

        System.out.println(configMessage);
        System.out.println(start-end);


        //let's get 2nd instance
        ConfigManager configManager1=ConfigManager.getConfigManager();
        System.out.println(configManager1);

        start=System.currentTimeMillis();
        String configMessage1=configManager1.getConfiguration();
        end=System.currentTimeMillis();

        System.out.println(configMessage1);
        System.out.println(start-end);
    }

}
