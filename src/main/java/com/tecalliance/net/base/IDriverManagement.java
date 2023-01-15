package com.tecalliance.net.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public interface IDriverManagement {
	/**
	 * Get Chrome driver
	 * @param ChromeOptions option
	 * @return WebDriver driver
	 * @throws Exception
	 */
	WebDriver getChromeDriver(ChromeOptions options) throws Exception;
}
