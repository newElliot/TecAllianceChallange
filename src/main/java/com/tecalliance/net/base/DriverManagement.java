package com.tecalliance.net.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.tecalliance.net.utils.Assertions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DriverManagement extends Assertions implements IDriverManagement {
	private static final Logger logger = LogManager.getLogger();
	private static final int MAX_ATTEMPTS = 5;
	private WebDriver driver;
	
	public DriverManagement(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public WebDriver getChromeDriver(ChromeOptions options) throws Exception {
		int attempts = 0;
		
		do {
			verifyNull(driver, "        Driver is already initialized");
			try {
				logger.info("    Starting init chrome driver");
				driver = new ChromeDriver(options); 
			} catch (Exception e) {
				logger.error("        Failed while trying to init chrome driver. Attempts: " + attempts, e);
			}
		} while (driver == null && attempts++ < MAX_ATTEMPTS);
		
		return driver;
	}
	
}
