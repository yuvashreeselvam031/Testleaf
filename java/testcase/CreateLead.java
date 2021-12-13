package testcase;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class CreateLead extends BaseHooks{

	@BeforeTest
	public void setValue() {

		excelFileName = "createLead";
	}
	@Test(dataProvider="fetchData")
	public void toRunCreateLead(String username, String Password,String compname, String fname, String lname) {

		LoginPage lp = new LoginPage();
		lp.enterUsername(username).enterPassword(Password).clickLoginButton()
		.clickCRMSFA()
		.clickCreateleadLink().enterAllDetails( compname,  fname,  lname).clickCreateLeadButton();
		
	}
}
