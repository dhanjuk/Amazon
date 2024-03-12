package amazonST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSign {
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
	@Test
	public void check() { // check displayed text
		p.signinfo("singhsharanjeet748@gmail.com", "Jatinder");
		WebElement e=ob.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		WebElement e1=ob.findElement(By.cssSelector("#nav-link-accountList > span"));
		System.out.println(e.getText());
		System.out.println(e1.getText());
			
	}
	
	
	@Test(priority=1)// order module
	public void validdata() {
		p.signinfo("singhsharanjeet748@gmail.com", "Jatinder");
		Actions a1=new Actions(ob);
		a1.moveToElement(ob.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		ob.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		ob.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
		boolean b=ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > "
				+ "div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")).isDisplayed();
		System.out.println(b);
		boolean n =ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a")).isDisplayed();
		System.out.println(n);
		boolean c= ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(6) > a")).isDisplayed();
		System.out.println(c);
	}	
	@Test(priority=2)
	public void invalid() throws InterruptedException {
		p.signinfo("singhsharanjeet748@gmail.com", "");
		Thread.sleep(3000);
	}	
	/*@AfterMethod
	public void close() {
		ob.close();		
	}*/
}
