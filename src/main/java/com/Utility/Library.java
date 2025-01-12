package com.Utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_SendKeys( WebElement element,String value) {
		try {
			element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		public static void custom_Click( WebElement element) {
			try {
				element.click();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
			public static void custom_Clicks( WebElement element) {
				try {
					element.click();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
	}
		public static String getAlertText(WebDriver driver ) {
			return driver.switchTo().alert().getText();
		}
	
		public static void acceptAlert(WebDriver driver ) {
			 driver.switchTo().alert().accept();
		}
		
		
		public static String getwindow( WebDriver driver) {
			return driver.getWindowHandle();
			
		}
		public static void getWindowHandels(WebDriver driver ) {
			Set<String>allwids=driver.getWindowHandles();
			System.out.println("allwids: "+allwids);
			Iterator<String>It=allwids.iterator();
			while( It.hasNext()) {
				String ids=It.next();
				if( getwindow(driver).equals(ids)) {
					driver.switchTo().window(ids);
				}
			
			
}
}
      public static void switchwindow(WebDriver driver) {
			Set<String>allwids=driver.getWindowHandles();
			List list=new ArrayList<String>(allwids);
		    String id=(String) list.get(1);
		    driver.switchTo().window(id);
			
		}
      
      public static void iframe(WebDriver driver,WebElement Element) {
    	  
    	  driver.switchTo().frame(Element);
    	 
    	  
    	  
    	 
      }
    	  
    	  
    	  
    	  public static void defaultContent(WebDriver driver) {
    		  driver.switchTo().defaultContent();
    		  
    	  
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}		
		
