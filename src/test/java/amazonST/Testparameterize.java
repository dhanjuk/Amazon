package amazonST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testparameterize {
	WebDriver ob;
	ANomain p=new ANomain(ob);
	@BeforeMethod
	public void open() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		ob=new ChromeDriver();
		p=new ANomain(ob);
		ob.get("https://www.amazon.com");
		Thread.sleep(10000);
	}
	@DataProvider(name="getdata")
	public Object[][] search(){
	return new Object[][] {{"t-shirts for women"},{"toys for kids"},{"23333"}};
	}
	@Test(dataProvider="getdata")// Search module
	public void validdata(String s) throws InterruptedException {
		//p.signinfo("singhsharanjeet748@gmail.com", "Jatinder");
		ob.findElement(By.id("twotabsearchtextbox")).sendKeys(s);
		ob.findElement(By.id("nav-search-submit-button")).click();
	}
}
