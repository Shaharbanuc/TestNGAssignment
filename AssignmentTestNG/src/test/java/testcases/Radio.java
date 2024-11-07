package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radio extends BaseThree{
	@Test
	public void isEnabled()
	{
		driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		WebElement disabledone=driver.findElement(By.xpath("//input[@id='radio-choice-7a']"));
		System.out.println(disabledone.isEnabled());
		WebElement iagree=driver.findElement(By.xpath("//label[text()='I agree']"));
		System.out.println(iagree.isEnabled());
		iagree.click();
	}

}
