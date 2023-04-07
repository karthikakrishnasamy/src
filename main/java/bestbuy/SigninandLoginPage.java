package bestbuy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


public class SigninandLoginPage 
{
	public WebDriver driver;
	public SigninandLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
   //Locating an elements for Signin
	@FindBy(xpath=("(//img[@alt='Canada'])[1]"))
	WebElement CanadaRegion;
	
	@FindBy(xpath=("(//span[@class='v-p-right-xxs line-clamp'])"))
	WebElement accountButton;
	
	@FindBy (xpath = ("(//a[@tabindex='0'])[11]"))
	WebElement account;
	
	
	@FindBy (xpath = ("(//input[@id='FirstName'])"))
	WebElement FirstName;

	@FindBy (xpath = ("(//input[@id='LastName'])"))
	WebElement LastName;
	
	@FindBy (xpath = ("(//input[@id='Email'])"))
	WebElement Email;
	
	@FindBy (xpath = ("(//input[@id='Password'])"))
	WebElement Password;
	
	@FindBy( xpath = ("(//input[@id='ConfirmPassword'])"))
	WebElement ConfirmPassword;
	
	@FindBy (xpath = ("(//input[@num='MobileNumber'])"))
	WebElement MobileNumber;
	
	@FindBy (xpath= ("//accountrecovery"))
	WebElement Accountrecovery;
	
	
	@FindBy (xpath=("//Createaccount"))
	WebElement CreateAccount;
	
	@FindBy (xpath = ("(//input[@id='Email'])"))
	WebElement Email ;
	
	@FindBy (xpath = ("(//input[@id='Password'])"))
	WebElement Password;
	
	@FindBy (xpath = ("(//input[@id='LoginButton'])"))
	WebElement LoginButton;
	
	public void Login() 
	{
		loginkey.click();
	}
	
	public void EmailButton() 
	{
		emailbutton.click();
	}
	
	public void EmailId(String Email) 
	{
		enteremailid.sendKeys(Email);
	}
	
	public void Password(String Password) 
	{
		enterpassword.sendKeys(Password);
	}
	
	public void invalidPassword(String invalidPassword) 
	{
		enterinvalidpassword.sendKeys(invalidPassword);
	}
	
	public void loginButton() 
	{
		loginbutton.click();
	
	driver.quit();
	}


