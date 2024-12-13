package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunClopay {

	@Test
	public void testmethod() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://test-cca.clopay.com/login");
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("evokeuser");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Welcome@1234");
		driver.findElement(By.cssSelector("#btnSignIn")).click();
		//driver.close();
		
		
	}

}
