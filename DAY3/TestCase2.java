// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC002Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC002() {
    driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.linkText("Phones & PDAs")).click();
    driver.findElement(By.linkText("HTC Touch HD")).click();
    driver.findElement(By.cssSelector(".col-sm:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".col-sm li:nth-child(4)")).click();
    driver.findElement(By.cssSelector("#content > .row")).click();
    vars.put("var", driver.findElement(By.cssSelector("h1")).getText());
    System.out.println("$(var)");
    driver.close();
  }
}
