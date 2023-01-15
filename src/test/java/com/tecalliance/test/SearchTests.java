package com.tecalliance.test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tecalliance.net.base.BaseTest;
import com.tecalliance.net.jbehave.base.StoryRunner;
import com.tecalliance.net.jbehave.step.GoogleSearchSteps;

public class SearchTests extends BaseTest {
	private StoryRunner runner;
	
	@BeforeMethod
	public void preCondition() {
		runner = new StoryRunner();
	}
	
	@Parameters("storyName")
	@Test(description = "Open google home page and search for keyword 'JBehave'")
	public void searchKeyWord(String storyName) {
		logger.info("========== Starting test case [searchKeyword] ==========");
		runner.setStoryName(storyName);
		runner.setObject(new GoogleSearchSteps(driver, wait));
		runner.run();
	}
}
