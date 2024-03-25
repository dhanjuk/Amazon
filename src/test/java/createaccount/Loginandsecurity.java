package createaccount;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Loginandsecurity {
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
		Actions a1=new Actions(ob);
		a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		ob.findElement(By.cssSelector("z#nav-al-your-account > a:nth-child(2) > span")).click();
		ob.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")).click();
		
		ob.findElement(By.cssSelector("#NAME_BUTTON > span > a")).click();
		ob.findElement(By.id("ap_customer_name")).clear();
		ob.findElement(By.id("ap_customer_name")).sendKeys("Jatinder");
		ob.findElement(By.id("cnep_1C_submit_button")).click(); // name update
		
		ob.findElement(By.cssSelector("#MOBILE_NUMBER_BUTTON > span > a")).click();// add mobile number
		ob.findElement(By.cssSelector("#a-autoid-0-announce > span")).click();		
		ob.findElement(By.cssSelector("#auth-country-picker_34")).click();
		ob.findElement(By.id("ap_phone_number")).clear();
		Thread.sleep(3000);
		ob.findElement(By.id("ap_phone_number")).sendKeys("3432972828");
		ob.findElement(By.id("auth-continue")).click();
		Thread.sleep(1000);	
		ob.findElement(By.id("auth-verification-ok-announce")).click();
		Thread.sleep(8000);	
		
	}

}
