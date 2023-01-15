package com.tecalliance.net.jbehave.base;

import java.util.Collections;

import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

public class StoryRunner extends ConfigurableEmbedder {
	public Embedder embedder;
	private String storyName;
	private Object obj;

	public void run() {
		embedder = configuredEmbedder();
		embedder.configuration();
		embedder.runStoriesAsPaths(Collections.singletonList(storyName));
	}
	
	public Configuration configuration() {
		return new MostUsefulConfiguration();
	}
	
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), obj);
	}
	
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	
	public void setObject(Object obj) {
		this.obj = obj;
	}
	
}
