package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
    
	@Test
	
	public void welcomeMessage() {
		String expectedResult ="Connect with friends and the world around you on Facebook.";
		String actualResult = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		
		Reporter.log("Expected Result =" + expectedResult);
		Reporter.log("Actual Result =" + actualResult);
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the welcome message");
		
	}
@Test
	
	public void emailValidation() {
		String expectedResult ="Email or phone number";
		String actualResult = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		Reporter.log("Expected Result =" + expectedResult);
		Reporter.log("Actual Result =" + actualResult);
		assertTrue(actualResult.equals(expectedResult), "Mismatch in the email");
		
	}
@Test

public void passValidation() {
	String expectedResult ="Password";
	String actualResult = driver.findElement(By.id("pass")).getDomAttribute("placeholder");
	
	Reporter.log("Expected Result =" + expectedResult);
	Reporter.log("Actual Result =" + actualResult);
	assertTrue(actualResult.equals(expectedResult), "Mismatch in the Password");
	
}
@Test

public void loginValidation() {
	String expectedResult ="Log In";
	String actualResult = driver.findElement(By.name("login")).getText();
	
	Reporter.log("Expected Result =" + expectedResult);
	Reporter.log("Actual Result =" + actualResult);
	assertTrue(actualResult.equals(expectedResult), "Mismatch in the login");
	
}
}
