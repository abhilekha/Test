import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test()
	public void testEmailGenerator() {

		RandomEmailGenerator obj = new RandomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}

}
