package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {

	HomePage hp;
	
	@BeforeClass
	public void HomeObject() {
		hp = new HomePage(driver);
	}
	@Test (priority=1)
	public void Verify2() {
		hp.Verify1();
	}
	
	@Test (priority=2)
	public void Logout2() {
		hp.Logout1();
	}
}
