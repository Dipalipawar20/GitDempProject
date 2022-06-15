package FlipCart;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Appliance 
{
	
	public static void main(String[] args) throws InterruptedException
	{
	 	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\New folder\\chromedriver.exe");
	
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	     
	      
	      driver.get("https://www.flipkart.com");
	      
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  
			
			  /*String parent =driver.getWindowHandle();
			  
			  Set<String> allwindows = driver.getWindowHandles();
			  
			  int cnt = allwindows.size();
			  
			 // System.out.println(cnt);
			  
			  for(String child : allwindows) 
			  { 
				  if(!child.equals(parent)) 
			  {
			  driver.switchTo().window(child);
			  
			  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			  
			  
			  }*/
	         
	        Actions act =new Actions (driver);
	      
			WebElement ele =driver.findElement(By.xpath("//div[@class='_37M3Pb']/div[7]"));
         
			act.moveToElement(ele).perform();
			
			driver.findElement(By.xpath("//a[text()='Home Appliances']")).click();
			
			System.out.println("hi");
			
	
	}
	
			  
			 
	
	   
	}
	      
	      
	
	


