package amazonST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testaddress {
		WebDriver ob;
		ANomain p=new ANomain(ob);
		@BeforeMethod
		public void open() throws InterruptedException {
			System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
			ob=new ChromeDriver();
			p=new ANomain(ob);
			ob.get("https://www.amazon.com");
			Thread.sleep(10000);
			Actions a=new Actions(ob);
	        a.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
			ob.findElement(By.cssSelector("#nav-flyout-ya-signin > a > span")).click();
		}		
		
		
		  @Test(priority=0)// Address module 
		  public void validdata() throws InterruptedException { 
		  p.signinfo("singhsharanjeet748@gmail.com","Jatinder");
		  Actions a1=new Actions(ob);
		  a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  ob.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		  p.Addaddress("jatinder","3432972828","7287 shallford rd","","L4T2P8","123455"
		  ); }
		 
	
		
		  @Test(priority=1)// Address module 
		  public void Invaliddata() throws InterruptedException {
			p.signinfo("singhsharanjeet748@gmail.com","Jatinder");
		  
		   Actions a1=new Actions(ob);
		  a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  ob.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click(); 
		  p.Addaddress("","","7287 shallford rd","","L4T2P8","123455"); 
		  }
		  
		  @Test(priority=2)// Login module
		  public void security() throws InterruptedException {
		  p.signinfo("singhsharanjeet748@gmail.com","Jatinder"); 
		  Actions a1=new Actions(ob);
		  a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  Thread.sleep(2000); 
		  p.Updateinfo("jatinder","3432972828"); //update name and phone no. 
		  }
		 
	
}
