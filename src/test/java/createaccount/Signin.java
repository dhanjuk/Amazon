package createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		ob.findElement(By.cssSelector("#nav-al-your-account > a:nth-child(2) > span")).click();
		ob.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
		boolean b=ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > "
				+ "div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")).isDisplayed();
		System.out.println(b);
		boolean n =ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(3) > a")).isDisplayed();
		System.out.println(n);
		boolean c= ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(6) > a")).isDisplayed();
		System.out.println(c);
		Thread.sleep(2000);
		
		ob.findElement(By.cssSelector("#a-page > section > div.your-orders-content-container__content.js-yo-main-content > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
	WebElement e=ob.findElement(By.cssSelector("#CardInstance4DXHcFJ0k0HqUiut-ldR1Q > div > span"));
	System.out.println(e.getText());
	//Thread.sleep(2000);
	ob.findElement(By.cssSelector("#CardInstanceskDdxeh5-7IHZG7i5vORhg > div > div:nth-child(3) > ul > li:nth-child(4) > span > a")).click();
	
	WebElement e1=ob.findElement(By.cssSelector("#ordersContainer > div.a-row.a-spacing-extra-large.a-spacing-top-large > div"));
	System.out.println(e1.getText());
	Thread.sleep(2000);
	ob.findElement(By.cssSelector("#orderTypeMenuContainer > ul > li:nth-child(7) > span > a")).click();
	WebElement e2=ob.findElement(By.cssSelector("#ordersContainer > div.a-row.a-spacing-extra-large.a-spacing-top-large > div"));
	System.out.println(e2.getText());
	
	
	
	}

}
