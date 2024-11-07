package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Check extends BaseThree{
	@Test
	public void chceckBox()
	{
		driver.navigate().to("https://formstone.it/components/checkbox/");
		WebElement one=driver.findElement(By.xpath("//input[@id='checkbox-1']"));
		System.out.println(one.isEnabled());
		System.out.println(one.isSelected());
		//one.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",one);
	}

}
