package amazonST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ANomain {
	WebDriver a;
	@FindBy(id="ap_customer_name") WebElement Cname;   //create account
	@FindBy(id="ap_email") WebElement Email;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="ap_password_check") WebElement Passcheck;
	@FindBy(id="continue") WebElement Continue;
	
	@FindBy(css="#ap_email") WebElement Semail;      //Sign in
	@FindBy(id="continue") WebElement Scontinue;
	@FindBy(id="ap_password") WebElement Spassword;
	@FindBy(name="rememberMe") WebElement Sremember;
	@FindBy(id="signInSubmit") WebElement Signin;
	
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement Order;    //Address module
	@FindBy(css="#ya-myab-plus-address-icon") WebElement Addaddress;
	@FindBy(css="#address-ui-widgets-countryCode > span > span") WebElement Country;
	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId_39") WebElement Canada;
	@FindBy(css="#address-ui-widgets-enterAddressFullName") WebElement Aname;      
	@FindBy(css="#address-ui-widgets-enterAddressPhoneNumber") WebElement Aphone;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement Address;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement City;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span") WebElement Province;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8") WebElement Ontario;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement Postal;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement Default; 
	@FindBy(id="address-ui-widgets-addr-details-gate-code") WebElement Delivery; 
	@FindBy(css="#address-ui-widgets-addr-details-business-hours > span > span") WebElement Weekend; 
	@FindBy(id="dropdown1_1") WebElement Option; 
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input") WebElement Add; 	
	
	@FindBy(css="#nav-al-your-account > a:nth-child(2) > span") WebElement Aaccount; //login and security
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span") WebElement Login;
	@FindBy(css="#NAME_BUTTON > span > a") WebElement Nameb;
	@FindBy(id="ap_customer_name") WebElement Cnamen;//clear then send      
	@FindBy(id="cnep_1C_submit_button") WebElement Submit;
	@FindBy(css="#MOBILE_NUMBER_BUTTON > span > a") WebElement Mobilebtn;
	@FindBy(css="#a-autoid-0-announce > span") WebElement Countrybtn;
	@FindBy(css="#auth-country-picker_34") WebElement Canadabtn;
	@FindBy(id="ap_phone_number") WebElement Phoneno; //clear then send
	@FindBy(id="auth-continue") WebElement Continuebtn;
	@FindBy(id="auth-verification-ok-announce") WebElement Verifybtn;	
	
	
	@FindBy(id="twotabsearchtextbox") WebElement Search;  //search module
	@FindBy(id="nav-search-submit-button") WebElement Searchbtn;
	@FindBy(css="#a-autoid-0-announce > span.a-dropdown-prompt") WebElement Sorting; //sort by newest arrival
	@FindBy(id="s-result-sort-select_4") WebElement Sortoption;
	@FindBy(css="#p_36\\/2661613011 > span > a > span") WebElement Filterprice; //filter by price
	@FindBy(css="#p_n_date_first_available_absolute\\/15196852011 > span > a > span") WebElement Filterdays;//filter by last 30 days

	@FindBy(id="nav-cart-count") WebElement Item;  //cart module
	@FindBy(name="submit.addToCart") WebElement Addcart;
	@FindBy(name="proceedToRetailCheckout") WebElement Checkout; 
	@FindBy(name="ppw-claimCode") WebElement Coupon;
	@FindBy(name="ppw-claimCodeApplyPressed") WebElement Press ; 
	@FindBy(css="#banner-image > span > span > i") WebElement Logo;
	@FindBy(id="a-autoid-1-announce") WebElement Returncart;
	@FindBy(name="submit.delete.f3027c92-84a7-4229-b01c-87a2568190ae") WebElement Delete;
	@FindBy(name="submit.delete.2523f53c-2b42-45e0-abba-82e53bea442b") WebElement Delete2;
	@FindBy(css="#nav-cart-count-container > span.nav-cart-icon.nav-sprite") WebElement Cart;
	
		
	public ANomain(WebDriver a) {
		PageFactory.initElements(a,this); }	
	
	public void productno(String search) {   // no. of products 
		Search.sendKeys(search);
		Searchbtn.click();
	}
	
	public void Cart(String search,String coupon) throws InterruptedException {
		Search.sendKeys(search);
		Searchbtn.click();
		Item.click();
		Addcart.click();
		Addcart.click();
		Checkout.click();
		Coupon.sendKeys(coupon);
		Press.click();
		
	}
	public void Delete() {     //cart
		Cart.click();
		Delete.click();
		Delete2.click();
	}
	
	
	
	public void Search(String search) throws InterruptedException {     //search
		Search.sendKeys(search);
		Searchbtn.click();
		Sorting.click();
		Sortoption.click();
		Thread.sleep(3000);
		Filterprice.click();
		Thread.sleep(3000);
		Filterdays.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void Updateinfo(String cname, String phoneno) throws InterruptedException {  //login and security
		Aaccount.click();
		Login.click();
		Nameb.click();
		Cnamen.clear();
		Cnamen.sendKeys(cname);
		Submit.click();
		Thread.sleep(2000);	
		Mobilebtn.click();
		Countrybtn.click();
		Canadabtn.click();
		Phoneno.clear();
		Thread.sleep(2000);
		Phoneno.sendKeys(phoneno);
		Continuebtn.click();
		Thread.sleep(1000);	
		Verifybtn.click();
		Thread.sleep(8000);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void Addaddress(String aname, String aphone, String address,String city,String postal,String delivery) throws InterruptedException {
		Order.click();
		Addaddress.click();
		Country.click();
		Canada.click();
		Thread.sleep(3000);
		Aname.sendKeys(aname);
		Aphone.sendKeys(aphone);
		Address.sendKeys(address);
		City.sendKeys(city);
		Province.click();
		Ontario.click();
		Postal.sendKeys(postal);
		Default.click();
		Thread.sleep(3000);
		Delivery.sendKeys(delivery);
		Thread.sleep(3000);
		Weekend.click();
		Option.click();
		Add.click();
			
	}
	
	
	public void signinfo(String semail, String spassword) {
		Semail.sendKeys(semail);
		Scontinue.click();
		Spassword.sendKeys(spassword);
		Sremember.click();
		Signin.click();
	}
	
    public void writeinfo(String cname,String email, String password,String passcheck) { //account
		Cname.sendKeys(cname);
		Email.sendKeys(email);
		Password.sendKeys(password);
		Passcheck.sendKeys(passcheck);
		Continue.click();
	}

}