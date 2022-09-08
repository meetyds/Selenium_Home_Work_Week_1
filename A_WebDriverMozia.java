package SeleniumChrome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_WebDriverMozia {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.nopcommerce.com/en");
    }
}
