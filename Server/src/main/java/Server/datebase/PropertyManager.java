package Server.datebase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
    private final static String propertyFile = "app.properties";
    private final static String localPropertyFile = "C:/Users/����/IdeaProjects/Lab7promo/Server/src/main/resources/";

    public static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(localPropertyFile.concat("/").concat(propertyFile));
            properties.load(fis);
            return properties.getProperty(propertyName);
        } catch (IOException unexpected) {
            unexpected.printStackTrace();
            return null;
        }
    }
}
//todo ��������