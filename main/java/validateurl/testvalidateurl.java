package validateurl;

import org.testng.annotations.test;


public class testvalidateurl extends Baseclass
{
     @Test(priority=0)
	public void main BrokenURL
	{
		validateURL validurl =new validateURL(driver);
		validurl.verifyTitle();
		System.out.println("Given link is not a broken URL");

	}

}
