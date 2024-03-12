package createaccount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Search {

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
		ob.findElement(By.id("twotabsearchtextbox")).sendKeys("t- shirts for women");
		ob.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		String actualString = ob.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]")).getText();

		String expectedString = "60 products";

		Assert.assertEquals(actualString, expectedString);
		// products on page
		/*WebElement e=ob.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]"));
		System.out.println(e.getText());
		
		//no. of products
		/*List<WebElement> products = ob.findElements(By.className("s-image"));
        int productsCount = products.size();
        System.out.println("Total Number of products : " + productsCount);
		
		//Next button
		//ob.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]")).click();
		
		/*ob.findElement(By.cssSelector("#a-autoid-0-announce > span.a-dropdown-prompt")).click();//sorting by newest arrival
		ob.findElement(By.id("s-result-sort-select_4")).click();
		Thread.sleep(3000);
		ob.findElement(By.cssSelector("#p_36\\/2661613011 > span > a > span")).click(); //Filtering by price
		Thread.sleep(3000);
        ob.findElement(By.cssSelector("#p_n_date_first_available_absolute\\/15196852011 > span > a > span")).click();//last 30 days
		*/
	}

}
