package amazonST;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		ob.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(10000);		
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
