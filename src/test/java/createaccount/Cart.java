package createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.amazon.com");
		Thread.sleep(10000);	
		Actions a=new Actions(ob);
		a.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		ob.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		ob.findElement(By.cssSelector("#ap_email")).sendKeys("singhsharanjeet748@gmail.com");	
		ob.findElement(By.id("continue")).click();	
		ob.findElement(By.id("ap_password")).sendKeys("Jatinder");	
		ob.findElement(By.name("rememberMe")).click();
		ob.findElement(By.id("signInSubmit")).click();
		
		ob.findElement(By.id("twotabsearchtextbox")).sendKeys("go go quinoa flour kirkland");
		ob.findElement(By.id("nav-search-submit-button")).click();
		ob.findElement(By.id("nav-cart-count")).click();
		ob.findElement(By.name("submit.addToCart")).click();
		//ob.findElement(By.name("submit.addToCart")).click();
		//ob.findElement(By.name("submit.addToCart")).click();		
		
		ob.switchTo().newWindow(WindowType.WINDOW); //reopen browser
		ob.get("https://www.amazon.com");
		ob.findElement(By.id("nav-cart-count")).click();
		
		
		
		ob.findElement(By.name("proceedToRetailCheckout")).click();
		Thread.sleep(8000);
		ob.findElement(By.name("ppw-claimCode")).sendKeys("CMJ123"); //Invalid coupon
		ob.findElement(By.name("ppw-claimCodeApplyPressed")).click();
		ob.findElement(By.name("submit.delete.a44a5236-eb9c-42bc-af9f-3d65c5476e3b")).click();//Delete item
		ob.findElement(By.name("submit.delete.9df32eae-8611-4cb7-9fcb-ae519896f143")).click(); 
		
		
	}
}
