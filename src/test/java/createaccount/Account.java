package createaccount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class Account {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.amazon.com");
		Actions a=new Actions(ob);
		a.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		ob.findElement(By.linkText("Start here.")).click();
		
		ob.findElement(By.id("ap_customer_name")).sendKeys("jatinder");
		ob.findElement(By.id("ap_email")).sendKeys("jatinderk365@gmail.com");
		ob.findElement(By.id("ap_password")).sendKeys("dhanju");
		ob.findElement(By.id("ap_password_check")).sendKeys("dhanju");
		ob.findElement(By.id("continue")).click();	
		
		
        //ob.close();
	}

}





/*Actions a=new Actions(ob);
a.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
ob.findElement(By.id("nav-link-accountList-nav-line-1")).click();
ob.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();*/
