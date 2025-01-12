package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.AlertPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Alert_handling extends BaseClass {
@Test
public void Alert_handling_001() throws Throwable {
		
	AlertPom alt=PageFactory.initElements(driver,AlertPom.class);

	alt.getUsername().sendKeys("ishwari");
	Library.custom_Click(alt.getSubmitbtn());
	System.out.println(Library.getAlertText(driver));
	System.out.println("*****************");
	Thread.sleep(4000);
	
	Library.acceptAlert(driver);
	Thread.sleep(4000);
	
	System.out.println(Library.getAlertText(driver));
	
	Thread.sleep(4000);
	
	Library.acceptAlert(driver);
	
	
	}
     
}
