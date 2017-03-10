package JavaPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class JavaClass {
	WebDriver dr;
	@BeforeTest
	public void beforeTest(){
		dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.manage().window().maximize();
	}
	@Test
	public void test() throws Exception {
		dr.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("FCB vs PSG");
		Thread.sleep(5000);
		dr.findElement(By.xpath(".//*[@id='_fZl']")).click();
	}
	@AfterTest
	public void afterTest(){
		System.out.println("after test");
	}
}
