package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertPopUp extends BaseThree{
	@Test
	public void simpleAlert()
	{
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement alertbox=driver.findElement(By.cssSelector("button[name='alertbox']"));
		alertbox.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmationAlert()
	{
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement confirmalertbox=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmalertbox.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void promptAlert()
	{
		driver.navigate().to("https://vinothqaacademy.com/alert-and-popup/");
		WebElement promptalert=driver.findElement(By.cssSelector("button[name='promptalertbox1234']"));
		promptalert.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("message");
		driver.switchTo().alert().dismiss();
	}

}
