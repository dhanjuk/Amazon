package amazonST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Apom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","Chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(10000);
		ANomain p=new ANomain(ob);
		
		p.writeinfo("Jatinder","jkaurd@gmail.com","jatinder","jatinder");
		p.signinfo("singhsharanjeet748@gmail.com", "Jatinder");
        p.Addaddress("jatinder","3432972828","123 abc rd","brampton","L4T2P8","123455");
        p.Updateinfo("jatinder", "3432972828");
        p.Search("t-shirts for women");
        p.Cart("go go quinoa flour kirkland", "CMJ123");
	}

}
