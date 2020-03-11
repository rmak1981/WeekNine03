package browsertesting2;
/*
IE browser testing to open https://www.barclays.co.uk/ website
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {
//package browsertesting;
        //import org.openqa.selenium.WebDriver;
        //import org.openqa.selenium.ie.InternetExplorerDrive
//public class IeBrowserTest {

    public static void main(String[] args) {

        String baseURL1 = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(baseURL1);

        driver.quit();
    }
}

