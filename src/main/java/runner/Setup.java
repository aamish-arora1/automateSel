package runner;

import exceptions.InvalidTestDataException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Setup {
    private static String configFilePath;
    private static Properties properties;
    private static Map<String,String> configs=new HashMap<>();
public void load(String providedConfigFilePath)
{
    configFilePath = providedConfigFilePath;
    properties = loadProperties(configFilePath);
}
 public Properties loadProperties(String configFile)
 {
     try {
         InputStream input = new FileInputStream(configFile);
         Properties properties;
         try {
             properties = new Properties();
             properties.load(input);
         } catch (Throwable var6) {
             try {
                 input.close();
             } catch (Throwable var5) {
                 var6.addSuppressed(var5);
             }
             throw var6;
         }
         input.close();
         return properties;
     } catch (IOException var7) {
         throw new InvalidTestDataException("Config file not found, or unable to read it"+ var7);
     }
 }

 public void convertToConfig(Properties propertiesFile)
 {

 }

}
