package com.tecalliance.net.jbehave.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tecalliance.net.domain.google.GoogleHome;
import com.tecalliance.net.utils.Assertions;
import com.tecalliance.net.utils.TecallianceUtils;

public class GoogleSearchSteps extends Assertions {
	private GoogleHome googleHome;
	private TecallianceUtils tecallianceUtils;
	
	private static final String GOOGLE_URL = "https://www.google.com.vn/?hl=en";
	
	public GoogleSearchSteps(WebDriver driver, WebDriverWait wait) {
		googleHome = new GoogleHome(wait);
		tecallianceUtils = new TecallianceUtils(driver);
	}
	
	@Given("I go to Google page")
	public void navigateToGoogle() {
		tecallianceUtils.navigateTo(GOOGLE_URL);
	}
	
	@When("I search keyword $keyword")
	public void searchWithKeyword(String keyword) {
		tecallianceUtils.enterValueWithEnter(googleHome.searchTextbox(), keyword);
	}
	
	@Then("I receive results included a string $expected")
	public void verifyResultReturn(String expected) {
		String content = tecallianceUtils.getPageSource();
		verifyTrue(content.contains(expected), "        Result should return search content");
	}
}
