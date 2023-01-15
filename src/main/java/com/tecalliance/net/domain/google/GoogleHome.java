package com.tecalliance.net.domain.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHome {
	private WebDriverWait wait;
	
	public GoogleHome(WebDriverWait wait) {
		this.wait = wait;
	}
	
	public WebElement searchTextbox() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	}
}
