package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

public class HomePage extends TestBase {

        public void clickLoginOrRegister() {
            driver.findElement(By.xpath("//div[@id='customernav']//a[1]")).click();
            String Url = driver.getCurrentUrl();
            Assert.assertEquals(Url,"https://automationteststore.com/index.php?rt=account/login");
        }
}
