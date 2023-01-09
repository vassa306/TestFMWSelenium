package rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main (String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        Properties config = new Properties();
        Properties OR = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
        config.load(fis);

        System.out.println(config.getProperty("browser"));

        fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Or.properties");
        config.load(fis);

        OR.load(fis);
        //driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))
        System.out.println(config.getProperty("bmlBtn_CSS"));
    }
}
