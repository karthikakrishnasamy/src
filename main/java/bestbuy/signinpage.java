package bestbuy;
import org.testng.annotations.Test;

import packagebase.BaseClass;

@Test
public class signinpage extends BaseClass 
{
public void Signin()
{
		Object driver;
		SinginandLoginPage  signin = new SigninandLoginPage(driver)
	    signin.selectUSregion();
		signin.navigatetoAccountButton();
		signin.setupAccount();
		signin.datafirstName(prop.getproperty("FirstName"));
		signin.datalastName(prop.getproperty("LastName"));
		signin.dataEmail(prop.getproperty("Email"));
		signin.dataPassword(prop.getproperty("Password"));
		signin.dataconfirmPassword(prop.getproperty("ConfirmPassword"));
		signin.datamobilenumber(prop.getproperty("MobileNumber"));
		signin.dataaccountRecovery();
		signin.datacreateaccount();
}
@Test
public void Login()
{
 
        SigninandLoginPage login = new SigninandLoginPage(driver);
         login.signin();
         login.EmailAddress(prop.getproperty("Email"));
         login.password(prop.getproperty("Password"));
         login.LoginButton();
		

	}

}
