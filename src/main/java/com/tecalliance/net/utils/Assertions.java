package com.tecalliance.net.utils;

import org.testng.Assert;

public class Assertions {

	/**
	 * Verify the given value. Failed if the value is false
	 * @param value boolean
	 * @param message string
	 */
	protected void verifyTrue(boolean value, String message) {
		Assert.assertTrue(value, message);
	}
	
	/**
	 * Verify the given value. Failed if the value is true
	 * @param value boolean
	 * @param message string
	 */
	protected void verifyFalse(boolean value, String message) {
		Assert.assertFalse(value, message);
	}
	
	/**
	 * Verify the given object. Failed if object is not null
	 * @param value
	 * @param message string
	 */
	protected void verifyNull(Object value, String message) {
		Assert.assertNull(value, message);
	}
	
	/**
	 * Verify the given object. Failed if object is null
	 * @param value object
	 * @param message string
	 */
	protected void verifyNotNull(Object value, String message) {
		Assert.assertNotNull(value, message);
	}
}
