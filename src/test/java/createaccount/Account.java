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
		
		ob.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(10000);
		
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
