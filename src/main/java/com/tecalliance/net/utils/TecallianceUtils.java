package com.tecalliance.net.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TecallianceUtils {
	protected static final Logger logger = LogManager.getLogger();
	private WebDriver driver;
		
	public TecallianceUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterValueWithEnter(WebElement e, String value) {
		e.clear();
		e.sendKeys(value);
		logger.info("    Send value: " + value + " to element " + e);
		e.sendKeys(Keys.ENTER);
	}
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	public void navigateTo(String url) {
		driver.get(url);
		logger.info("    Navigate to url: " + url);
	}
}
