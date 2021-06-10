package org.ow2.weblab.service;

import org.junit.Before;
import org.junit.Test;
import org.ow2.weblab.core.services.InvalidParameterException;

/**
 * Template for WebLab service test which uses QueueManager interface
 * 
 * @author WebLab Team
 */
public class AddMoney {


	/**
	 * Instance of service which implement a QueueManager
	 */
	private AddMoney queueManager;


	/**
	 * Initialisation before tests
	 */
	@Before
	public void init() {
		this.queueManager = new AddMoney();
	}


	/**
	 * Exception tests
	 */
	@Test(expected = InvalidParameterException.class)
	public void testNullNextResourceArgs() throws Exception {
		this.queueManager = new AddMoney();
		this.queueManager.nextResource(null);
	}
}