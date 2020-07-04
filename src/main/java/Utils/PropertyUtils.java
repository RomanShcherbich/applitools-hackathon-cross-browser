package Utils;

import lombok.Getter;

import java.io.*;
import java.util.Properties;


@Getter
public class PropertyUtils {

    private Properties properties = System.getProperties();

    public PropertyUtils() {
        try {
            this.properties.load(new FileInputStream(new File("resources/test.properties")));
        } catch (IOException e) {
            throw new RuntimeException("Properties has not been loaded");
        }
    }

    public String get(String property) {
        return properties.getProperty(property);
    }

}
