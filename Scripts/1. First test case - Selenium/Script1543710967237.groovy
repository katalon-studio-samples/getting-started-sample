import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*

import java.util.concurrent.TimeUnit
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebDriver driver = new ChromeDriver();
String baseUrl = "https://www.katalon.com/";
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://katalon-demo-cura.herokuapp.com");
driver.findElement(By.id("btn-make-appointment")).click();
driver.findElement(By.id("txt-username")).clear();
driver.findElement(By.id("txt-username")).sendKeys("John Doe");
driver.findElement(By.id("txt-password")).clear();
driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
driver.findElement(By.id("btn-login")).click();
driver.quit();

