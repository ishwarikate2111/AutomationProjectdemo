package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPom {
	@FindBy(how=How.XPATH,using=" //*[@name='cusid']")
	private WebElement Username;
	
	@FindBy (how=How.XPATH,using=" //*[@name='submit']")
	private WebElement Submitbtn;
	
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
}
