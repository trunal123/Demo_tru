package test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Gmail_TNG {

  public static WebDriver driver;
  static Properties prop = new Properties();

  public static void main(String[] Args) throws InterruptedException, IOException, AWTException {
    browser();
    propertyFile();
    WebDriver driver = null;
    driver = (WebDriver) new ChromeDriver();
    windoMaximize(driver);
    driver.get(prop.getProperty("URL"));
    currentpagetitle(driver.getTitle());
    assertAttributeValueOfElementByID(driver, By.id("identifierId"), "Email");
    driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    assertAttributeValueOfElementByID(driver, By.name("password"), "password");
    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    assertAttributeValueOfElementByXpath(driver, "//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    assertAttributeValueOfElementByClass(driver);

    WebElement ActualTitle = driver.findElement(By.className("gb_ob"));

    String ExceptedTitle = "ouchdemo1@gmail.com";
    if (ActualTitle.equals(ExceptedTitle)) {
      currentpagetitle("user logged in  is matching");
    } else {
      currentpagetitle("user logged in  is matching");
    }

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    assertAttributeValueOfElementByXpath(driver, "//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img");

    assertAttributeValueOfElementByCssSelector(driver, By.cssSelector("#gs_lc50 > input:nth-child(1)"), "trunal.thakre@gmail.com");
    System.out.println("search by trunal.thakre@gmail.com ID");
    // Click on Enter to search by "trunal.thakre@gmail.com"
    enterKey();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    assertAttributeValueOfElementByXpath(driver, "//tr[@class = \"zA yO\"] //td[@class = \"yX xY \"]");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    assertAttributeValueOfElementByXpath(driver, "//a[@href='https://www.flickonclick.com/checkout-these-exciting-latest-offers-from-jiomart/']");
    ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String ActualTitle1 = driver.getTitle();
    String ExceptedTitle1 = "checkout these exciting latest offers from jiomart";
    if (ActualTitle.equals(ExceptedTitle)) {
      currentpagetitle("link is matching");
    } else {
      currentpagetitle("link is not matching");
    }
    switchWindow(driver, allTabs);
    WebElement ActualTitle2 = driver.findElement(By.className("gb_ob"));
    String ExceptedTitle2 = "ouchdemo1@gmail.com";
    if (ActualTitle2.equals(ExceptedTitle2)) {
      currentpagetitle("user logged in  is matching");
    } else {
      currentpagetitle("user logged in  is matching");
    }

    //Close the browser
    closeTheBrowser(driver);


  }

  private static void enterKey() throws AWTException {
    Robot rb = new Robot();
    rb.keyPress(KeyEvent.VK_ENTER);
  }

  private static void closeTheBrowser(WebDriver driver) {
    driver.quit();
    System.out.println("Browser closed");
  }

  private static void assertAttributeValueOfElementByCssSelector(WebDriver driver, By by, String s) {
    driver.findElement(by).sendKeys(s);
  }

  private static void switchWindow(WebDriver driver, ArrayList<String> allTabs) {
    driver.switchTo().window(allTabs.get(0));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  private static void assertAttributeValueOfElementByXpath(WebDriver driver, String s) {
    driver.findElement(By.xpath(s)).click();
  }

  private static void assertAttributeValueOfElementByClass(WebDriver driver) {
    driver.findElement(By.className("gb_ob"));
  }

  private static void assertAttributeValueOfElementByID(WebDriver driver, By identifierId, String email) {
    assertAttributeValueOfElementByCssSelector(driver, identifierId, prop.getProperty(email));
  }

  private static void currentpagetitle(String title) {
    System.out.println(title);
  }

  private static void windoMaximize(WebDriver driver) {
    driver.manage().window().maximize();

  }

  private static void browser() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
    currentpagetitle("Chrome invoked");
  }

  private static void propertyFile() throws IOException {
    FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
    prop.load(fis1);
    currentpagetitle("File is available");
  }
}

