package xcell.maven_data;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fb.com.Baseclass.Base_Class_Ipt2;

public class windows  {
 public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[class=\"_2KpZ6l _2doB4z\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("bicycle\n");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[3]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		String title = driver.switchTo().window(string).getTitle();
		System.out.println(title);
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='20 inches']")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("[placeholder=\"Enter Delivery Pincode\"]")).sendKeys("632007\n");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//li[contains(@class,'col')])[1]")).click();	
	
	
	
	
 }
}
