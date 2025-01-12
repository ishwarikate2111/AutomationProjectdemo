package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.PageObject.GetWindow_Pom;
import com.PageObject.IFrame_Pom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class IFrame extends BaseClass {
	public void iframe()	{
		
		IFrame_Pom pom=PageFactory.initElements( driver,IFrame_Pom.class);
		
	}

	
	}


