package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends TestBase {

        public void clickLoginOrRegister() {
            driver.findElement(By.xpath("//div[@id='customernav']//a[1]")).click();
            String Url = driver.getCurrentUrl();
            Assert.assertEquals(Url,"https://automationteststore.com/index.php?rt=account/login");
        }

        public void checkContactInformation(){

        }

        public void clickSpecialLink(){

        }

        public void checkAboutUsInfo(){

        }
}
