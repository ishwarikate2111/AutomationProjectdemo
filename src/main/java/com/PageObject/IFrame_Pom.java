package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IFrame_Pom {
@FindBy(how=How.XPATH,using=" //*[@src='frame_1.html' ")public WebElement frame1st;
@FindBy(how=How.XPATH,using=" //*[@src='frame_2.html' ")public WebElement frame2nd;
@FindBy(how=How.XPATH,using=" //*[@src='frame_3.html' ")public WebElement frame3rd;
@FindBy(how=How.XPATH,using="  //*[@src='frame_4.html'")public WebElement frame4th;

@FindBy(how=How.XPATH,using="//*[@name='mytext1']") private WebElement frame1;
@FindBy(how=How.XPATH,using="//*[@name='mytext2']") private WebElement frame2;
@FindBy(how=How.XPATH,using="//*[@name='mytext3']") private WebElement frame3;
@FindBy(how=How.XPATH,using="//*[@name='mytext4']") private WebElement frame4;


public void getFrame1st() {
	
}

public void getFrame2nd() {
	
}
public void getFrame3rd() {
	
}

public void getFrame4th() {
	
}
public WebElement getFrame1() {
	return frame1;
}

public WebElement getFrame2() {
	return frame2;
}
	

public WebElement getFrame3() {
	return frame3;
}

public WebElement getFrame4() {
	return frame4;
	
}


}
