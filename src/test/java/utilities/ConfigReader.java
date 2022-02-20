// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    public ConfigReader() {
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    static {
        String path = "src/configuration.properties";

        try {
            FileInputStream fis = new FileInputStream(path);
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException var2) {
            var2.printStackTrace();
        }
    }
}