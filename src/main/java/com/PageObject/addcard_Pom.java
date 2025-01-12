package com.PageObject;

import java.security.PrivateKey;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addcard_Pom {

@FindBy(how=How.XPATH,using=" //*[@id='nav-search-submit-button']")
private WebElement Screach;



public WebElement getScreach() {
	return Screach;
}


	}


