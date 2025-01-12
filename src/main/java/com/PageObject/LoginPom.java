package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utility.BaseClass;

public class LoginPom  {
	@FindBy(how=How.XPATH,using="//*[@id='email']")
	private WebElement Email;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='pass']")
	private WebElement Pass;
	
	
//	@FindBy (how=How.XPATH,using="//*[@name='cusid']")
//	public WebElement cusid;
//	
//	@FindBy (how=How.XPATH,using="//*[@name='submit']")
//	public WebElement submit;
	
	
	
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPass() {
		return Pass;
}
//	public WebElement getloginBtn() {
//		return Btn;
//	}
	
	
}