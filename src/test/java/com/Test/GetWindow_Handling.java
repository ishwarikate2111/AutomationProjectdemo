package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.GetWindow_Pom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class GetWindow_Handling extends BaseClass {

@Test

public void getwindow()	{
	
	GetWindow_Pom pom=PageFactory.initElements( driver,GetWindow_Pom.class);
	
	   Library.custom_Click(pom.clickHere);
	 pom.getEmail().sendKeys("ishwarikate@gmail");
	// pom.submit1.click();
	 Library.getwindow(driver);
	// Library.getWindowHandels(driver);
	Library.switchwindow(driver);
	
//	for(int i=1;i<=3;i++ ) {
//		Library.custom_Click(pom.clickHere);
//		Library.getwindow(driver);
//		Library.getWindowHandels(driver);
//		
//		}
}
}
	
	
	
	
	
	
	
	
	
	
	

