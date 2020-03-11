package browsertesting2;

/*
 opera browser testing to openhttps://www.barclays.co.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest {
    public static void main(String[] args) {

        String baseURL04 = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.opera.driver","driver/operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.get(baseURL04);
        driver.quit();
    }
}
