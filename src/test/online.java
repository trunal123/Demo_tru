package test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class online {

  public static WebDriver driver;
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
    WebDriver driver = null;
    driver = (WebDriver) new ChromeDriver();

    driver.get("https://www.google.com/search?q=new+mobile+launch&rlz=1C1CHBF_enIN854IN854&oq=&aqs=chrome.0.69i59i450l8.71394117j0j15&sourceid=chrome&ie=UTF-8\")");

    driver.findElement(By.xpath("//*[contains(text(),'Apple iPhone 7 (32GB) - Black')]")).click();
    ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(allTabs.get(1));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println(driver.getTitle());

    driver.manage().window().maximize();

   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    extracted(driver, allTabs);
    driver.quit();
  }

  public static void extracted(WebDriver driver, ArrayList<String> allTabs) {
    driver.findElement(By.xpath("//*[contains(text(),\"Visit the Apple Store\")]")).click();

    ArrayList<String> allTabs1 = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(allTabs.get(1));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String ActualTitle = driver.getTitle();
    String ExceptedTitle = "Amazon.in: Apple: Home page";
    if (ActualTitle.equals(ExceptedTitle)) {
      System.out.println("link is matching");
    } else {
      System.out.println("link is not matching");
    }
  }

}

