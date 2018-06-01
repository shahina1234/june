package ecommerce.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ecommerce.ecommerce.basepage.BasePage;

public class CustomerRegistration extends BasePage
{
	 public static final Logger log=Logger.getLogger(CustomerRegistration.class.getName());
	//customer registration properties//
	@FindBy(linkText="Sign in") public WebElement signIn;
@FindBy( id="email_create")WebElement email;
@FindBy(id="SubmitCreate")WebElement submit;
@FindBy(xpath="//h1[text()='Create an account']")WebElement verifyAccountTittle;
@FindBy(id="id_gender2") WebElement mrs;
@FindBy(id="customer_firstname") WebElement FirstName;
@FindBy(id="customer_lastname")WebElement LastName;
@FindBy(id="passwd")WebElement Password;
@FindBy(id="days")WebElement days;
@FindBy(id="months")WebElement months ;
@FindBy(id="years")WebElement years ;
@FindBy(id="address1" )WebElement Address ;
@FindBy(id="city")WebElement city ;
@FindBy(id="id_state")WebElement state ;
@FindBy(id="postcode")WebElement zipcode ;
@FindBy(id="id_country")WebElement country ;
@FindBy(id="phone_mobile") WebElement mobile;
@FindBy(id="submitAccount")WebElement register;
@FindBy(xpath="//h1[text='MY ACCOUNT']") WebElement verifyMYACCOUNT;

public CustomerRegistration(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void customerRegistration()

{
	try {
		signIn.click();
		log.info("clicked on signIn using with object _"+signIn.toString());;
		email.sendKeys(getData("FirstName")+getData("LastName")+randomnumber()+getData("domain"));
		log.info("Entered User name as :-"+email.getAttribute("value")+"using with object"+email.toString());
		submit.click();
		elementVisible(60,verifyAccountTittle );
		Assert.assertTrue(verifyAccountTittle.getText().equalsIgnoreCase("Create an account"));
		//assertEquals("Create an account", verifyAccountTittle.getText());
		mrs.click();
		FirstName.sendKeys(getData("FirstName"));
		LastName.sendKeys(getData("LastName"));
		Password.sendKeys(getData("Password"));
		selectoption(days, 2);
		selectoption(months, 2);
		selectoption(years, 1);
		Address.sendKeys("errgadda");
		city.sendKeys("hyderaad");
		state.sendKeys("Florida");
		zipcode.sendKeys("00000");
		country.sendKeys("unitedstates");
		mobile.sendKeys("9063254874");
		register.click();
		assertEquals("MY ACCOUNT", verifyMYACCOUNT.getText());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
