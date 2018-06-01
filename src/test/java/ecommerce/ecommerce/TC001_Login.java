package ecommerce.ecommerce;

import org.testng.annotations.Test;


import ecommerce.ecommerce.basepage.BasePage;
import ecommerce.ecommerce.pageUI.CustomerRegistration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;

public class TC001_Login extends  BasePage{
  
  public static final Logger log=Logger.getLogger(TC001_Login.class.getName());
		
		  CustomerRegistration register;
  
  @BeforeClass
  @Parameters("browser")
  public void startprocess(String browser) throws Exception {
	  browserLaunch(browser, getData("ecommerceurl"));
  }
  @Test
  public void login() {
	  log.info("==========staring TC001_Login test=======");
	  register=new CustomerRegistration(driver);
	  	  register.customerRegistration();
	  log.info("==========staring TC001_Login test=======");
	  
	  
	  
	  
  }

 
	  
  
  @AfterClass
  public void endprocess() {
  }

}
