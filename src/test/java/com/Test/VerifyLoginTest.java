package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.ExceldataProvider;
import com.Utility.Library;


public class VerifyLoginTest extends BaseClass {
@Test
public void VerifyLoginTest_001() {
	
LoginPom login=PageFactory.initElements(driver, LoginPom.class);

//login.getEmail().sendKeys("email ");
//	
//login.getPass().sendKeys("password ");

}

}