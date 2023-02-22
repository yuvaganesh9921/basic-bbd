package itratorparticularrowcell;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import fb.com.Baseclass.Base_Class_Ipt2;

public class attrub extends Base_Class_Ipt2 {
	public static int min_value;
	public static void broswer_ln() {
		browser_Launch();
	}
	public static void url() {
		get("https://www.zomato.com/chennai/restaurants/biryani?category=1");
	}
	public static void cancel() {
		select(driver.findElement(By.xpath("//button[text()='✕']")));;
	}
	public static void search() {
		elementSendKeys(driver.findElement(By.xpath("//input[@type='text']")), "bicyle\n");
	}
	public static void bicycle() {
		List<WebElement> cycle = driver.findElements(By.xpath("//div[@class='_4ddWXP']//child::a[@class='s1Q9rs']"));
		int size = cycle.size();
		System.out.println("total size"+size);
		for (WebElement webElement : cycle) {
			System.out.println(webElement.getText());
		}
	
	}
	public static void cost() {
		List<WebElement> total_cost = driver.findElements(By.xpath("//div[@class='_4ddWXP']//child::a[@class='s1Q9rs']//preceding::div[@class='_30jeq3']"));
		int size = total_cost.size();
		System.out.println("total cost product"+size);
		ArrayList<Integer>min_cost=new ArrayList<Integer>();
		for (int i = 0; i < total_cost.size(); i++) {
			String value = total_cost.get(i).getText().replace("₹", "").replace(",", "");
			int amount = Integer.parseInt(value);
			min_cost.add(amount);
		}
		min_value=Collections.min(min_cost);
		System.out.println(min_value);
	}
	public static void food() {
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='jumbo-tracker']//descendant::h4"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
	}
	public static void main(String[] args) throws IOException {
		broswer_ln();
		url();
		//cancel();
		//search();
		//bicycle();
		//cost();
		food();
	}
}
