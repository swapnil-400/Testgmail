package Gamillogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver (2).exe");
			
			WebDriver driver = new ChromeDriver();
		
			// Launching of Gmail
			
			driver.navigate().to("https://mail.google.com");
			
			// Maximize Window
			
			driver.manage().window().maximize();
			
			// enter Login ID
			
			driver.findElement(By.cssSelector("#identifierId")).sendKeys("t74131119@gmail.com");

			// Click on next button
			
			driver.findElement(By.cssSelector("#identifierNext > div > button > div.VfPpkd-RLmnJb")).click();	
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			// Enter Password
			
			driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Test@400");
			
			// Click on Login Button
			
			driver.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")).click();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			// Click on Compose mail Function
			
			driver.findElement(By.cssSelector("#\\:3k > div > div")).click();
			
			// Enter Email ID
			
			driver.findElement(By.cssSelector("#\\:8y")).sendKeys("shindeswapnil0016@gmail.com");
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			// Enter Subject in Subject line
			
			driver.findElement(By.cssSelector("#\\:8g")).sendKeys("Test Mail");
			
			// Enter Text in Mail body
			
			driver.findElement(By.cssSelector("#\\:9l")).sendKeys("Test Document");
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			// Click in Send mail button
			
			driver.findElement(By.cssSelector("#\\:86")).click();
			
			
			
			
	}

}
