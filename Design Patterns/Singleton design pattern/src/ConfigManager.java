public class ConfigManager {
    public static volatile ConfigManager configManager;
    private String configure;

    private ConfigManager(){
        if(configManager!=null){
            throw new RuntimeException("please use getConfigManager method");
        }


    }

    public static ConfigManager getConfigManager(){
        if(configManager==null){
            synchronized (ConfigManager.class) {
                if(configManager==null){
                    configManager = new ConfigManager();
                }

            }
        }
        return configManager;
    }

    public String getConfiguration(){
       if(configure==null){
           synchronized (ConfigManager.class){
               if(configure==null){
                   configure="Configuration process success";
               }
           }
       }
       return configure;
    }

}
