package amazonST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Testcart {
		
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
			@Test(priority=0)// Cart module
			public void validdata() throws InterruptedException {
				p.signinfo("singhsharanjeet748@gmail.com", "Jatinder");
				p.Cart("go go quinoa flour kirkland", "CMJ123");
				
				
			}
			/*
			 * @Test(priority=1, enabled=false) public void Delete() {
			 * p.signinfo("singhsharanjeet748@gmail.com", "Jatinder"); 
			 * p.Delete(); }
			 */
}
