package createaccount;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddressModule {
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
		
		WebElement e=ob.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		WebElement e1=ob.findElement(By.cssSelector("#nav-link-accountList > span"));
		System.out.println(e.getText());
		System.out.println(e1.getText());
		
		
		  Actions a1=new Actions(ob);
		  a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  ob.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click(); 
		  ob.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")).click();
		  ob.findElement(By.cssSelector("#ya-myab-plus-address-icon")).click();
		  ob.findElement(By.cssSelector("#address-ui-widgets-countryCode > span > span")).click();
		  ob.findElement(By.id("address-ui-widgets-countryCode-dropdown-nativeId_39")).click(); Thread.sleep(3000);
		  ob.findElement(By.cssSelector("#address-ui-widgets-enterAddressFullName")).sendKeys("Jatinder");
		  ob.findElement(By.cssSelector("#address-ui-widgets-enterAddressPhoneNumber")).sendKeys("1234566789");
		  ob.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("7287 shallford rd");
		  ob.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Mississauga"); 
		  ob.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span")).click(); 
		  ob.findElement(By.id("address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")).click();
		  ob.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("L4T 2P8");
		  ob.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
		  Thread.sleep(3000);
		  ob.findElement(By.id("address-ui-widgets-addr-details-gate-code")).sendKeys("12345"); 
		  Thread.sleep(3000); 
		  ob.findElement(By.xpath("//*[@id=\"address-ui-widgets-addr-details-business-hours\"]/span/span")).click(); 
		  ob.findElement(By.id("dropdown1_1")).click(); 
		  ob.findElement(By.cssSelector("#address-ui-widgets-form-submit-button > span > input")).click()
		  ;
		 
	
	}

}
