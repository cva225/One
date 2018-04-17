package com.testNG.sel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAndOptional {
	WebDriver driver;
	@Parameters({"Name1"})
	@Test
	public void a1(@Optional("Cva")String Name) {
		if (Name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\FrameworkBasics\\\\drivers\\\\chromedriver.exe");
			//driver.get("https://www.facebook.com/");
		
		}
		//System.out.println("Cva");
		

	}

}
