package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Demo1 {
@Test
public void test() throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.google.com/gmail/about/");
     driver.findElement(By.xpath("//a[.='Sign In']")).click();        
     driver.findElement(By.id("identifierId")).sendKeys("singhdeepa9555");
    // test.log(LogStatus.PASS, "username is entered");
     driver.findElement(By.xpath("//span[.='Next']")).click();
    // test.log(LogStatus.PASS, "Next Button is clicked");
     Thread.sleep(3000);
     driver.findElement(By.name("password")).sendKeys("nilam_63");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//span[.='Next']")).click();
}
}
