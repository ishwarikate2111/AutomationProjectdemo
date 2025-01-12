package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetWindow_Pom {

	@FindBy(how=How.XPATH,using="//*[text()='Click Here'] ")
	public WebElement clickHere;
	
    @FindBy(how=How.XPATH,using="//*[@name='emailid'] ")
    private WebElement Email;
	
    @FindBy(how=How.XPATH,using="//*[@name='btnLogin'] ")
	public WebElement submit1;
	
	
	
 public void getClick() {
	}

 public WebElement getEmail() {
		return Email;
	}


 public void getSubmit1() {
		
	}



}




