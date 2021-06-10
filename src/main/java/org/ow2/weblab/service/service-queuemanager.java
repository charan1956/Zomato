package org.ow2.weblab.service;

import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ow2.weblab.core.services.AccessDeniedException;
import org.ow2.weblab.core.services.ContentNotAvailableException;
import org.ow2.weblab.core.services.InsufficientResourcesException;
import org.ow2.weblab.core.services.InvalidParameterException;
import org.ow2.weblab.core.services.QueueManager;
import org.ow2.weblab.core.services.ServiceNotConfiguredException;
import org.ow2.weblab.core.services.UnexpectedException;
import org.ow2.weblab.core.services.UnsupportedRequestException;
import org.ow2.weblab.core.services.queuemanager.NextResourceArgs;
import org.ow2.weblab.core.services.queuemanager.NextResourceReturn;

/**
 * Template for WebLab service which uses QueueManager interface
 * 
 * @author WebLab Team
 */
@WebService(endpointInterface = "org.ow2.weblab.core.services.QueueManager")
public class AddMoney implements QueueManager {


	/**
	 * The instance of logger used inside AddMoney
	 */
	private final Log logger;


	/**
	 * Constructor
	 */
	public AddMoney() {
		this.logger = LogFactory.getLog(this.getClass());

		// TODO Initialise other fields if needed

		this.logger.info("Service AddMoney successfully started");
	}


	@Override
	public NextResourceReturn nextResource(final NextResourceArgs args) throws AccessDeniedException, ContentNotAvailableException,
			InsufficientResourcesException, InvalidParameterException, ServiceNotConfiguredException, UnexpectedException, UnsupportedRequestException {
		this.logger.debug("Early start of nextResource method.");

		final String usageContext = this.checkNextResourceArgs(args);

		this.logger.info("Next resource uses usage context " + usageContext + ".");

		// TODO Implement your method here!

		this.logger.error("Method nextResource not yet implemented.");
		throw new UnsupportedRequestException("Method nextResource not yet implemented.");
	}


	/**
	 * Method that tests that the NextResourceArgs is correct regarding
	 * specification of AddMoney
	 * 
	 * @param args
	 *            The argument received by the nextResource method
	 * @return The usageContext inside <code>args</code>
	 * @throws InvalidParameterException
	 *             If args is <code>null</code>
	 */
	protected String checkNextResourceArgs(NextResourceArgs args) throws InvalidParameterException {
		if (args == null) {
			throw new InvalidParameterException("NextResourceArgs is null.");
		}
		return args.getUsageContext();
	}

}
