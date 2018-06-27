package com.qainfotech.Bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{   WebDriver driver;
    boolean condition;
	 public void setDriver()
	 { 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\workspace\\chromedriver.exe");

		 driver = new ChromeDriver();
	   driver.get("https://www.bing.com/translator");
	 }
	 public void language_1()
	 { 
		 Select value= new Select(driver.findElement(By.id("t_sl")));
	value.selectByVisibleText("Spanish");
			
	 }
	 public void language_2()
	 {
		 Select value2= new Select(driver.findElement(By.id("t_tl")));
		 value2.selectByVisibleText("French");
		 
	 }
	 public void add_text_to_be_translated()
	 {
		 driver.findElement(By.id("t_sv")).sendKeys("hola");
	 }
	 
	 public boolean output_Text()
	 {
		String str = driver.findElement(By.id("t_tv")).getText();
		if (str.equals("salut"))
		condition=true;
			return condition;
		
	 }
}
