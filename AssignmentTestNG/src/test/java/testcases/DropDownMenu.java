package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMenu extends BaseThree{
	@Test
	public void dropDown()
	{
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//fdprocessedid value changing ,xpath=select[@fdprocessedid='4iphro']
		WebElement selectcountry=driver.findElement(By.tagName("select"));
		System.out.println("entered");
		Select select=new Select(selectcountry);
		select.selectByVisibleText("Algeria");
		//System.out.println(selectcountry.getText());
	}

}
