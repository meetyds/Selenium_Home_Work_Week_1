package SeleniumChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_WebDriverChrome {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en");
    }
}
