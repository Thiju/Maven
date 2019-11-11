package TYSS.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

  @Test
  public void mainTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  WebDriver driver = new  ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Duke", Keys.ENTER);
	  Thread.sleep(4000);
	  //driver.findElement(By.xpath("//a[@class='q qs']")).click();
	  driver.findElement(By.xpath("//div[@class=\"r\"]")).click();
	  
	  String what = driver.findElement(By.xpath("//h2[@class='section-title mb_20']")).getText();
    System.out.println(what);
    driver.close();
  
  }
}
