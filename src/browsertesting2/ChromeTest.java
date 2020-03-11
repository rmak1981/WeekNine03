package browsertesting2;
/*
browser testing for chrome using https://www.barclays.co.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {

        String baseURL02 = "https://www.barclays.co.uk/";

        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(baseURL02);

        driver.quit();
    }

}
