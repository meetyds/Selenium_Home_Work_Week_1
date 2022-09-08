package SeleniumChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.session.EdgeFilter;

public class B_WebdriverEdge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.nopcommerce.com/en");
    }
}
