package browsertesting2;
/*
firefox browser testing to open  website https://www.barclays.co.uk/
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

    public static void main(String []args){

        String baseURL03 = "https://www.barclays.co.uk/";

        System.setProperty ("webdriver.gecko.driver","driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get(baseURL03);

        driver.quit();

    }
}
