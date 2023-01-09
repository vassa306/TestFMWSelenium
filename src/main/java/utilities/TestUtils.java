package utilities;

import base.TestBase;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtils extends TestBase {

    public static void captureScreenshot(String s) throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = formatter.format(date);
        String filename = "error_" +s.toLowerCase() + "-" + d.replace(":","_") + ".jpg";
        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./screenshot/" + filename));
        InputStream is = new FileInputStream("./screenshot/" + filename);
        Allure.addAttachment("Screenshot",is);

    }

}

