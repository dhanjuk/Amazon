package amazonST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Testng {
	WebDriver ob;
	ANomain p=new ANomain(ob);
	@BeforeMethod
	public void open() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		ob=new ChromeDriver();
		p=new ANomain(ob);
		ob.get("https://www.amazon.com");
		Actions a=new Actions(ob);
		a.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();		
		ob.findElement(By.linkText("Start here.")).click();		
	}	
	@Test(priority=1)
	public void validdata() {
		p.writeinfo("Jatinder","jkaurd@gmail.com","jatinder","jatinder");		
	}
	@Test(priority=2)
	public void Invaliddata() {
		p.writeinfo("","jkaurd@gmail.com","jatinder","jatinder");
	}
	@Test(priority=3)
	public void invalid() {
		p.writeinfo("jatinder","jkaurd@gmail.com","aaa","aaaa");
	}	
	@AfterMethod
	public void close() {
		ob.close();		
	}
}
