package com.epicProjects.common.serviceRouter.api;

import javax.annotation.Nonnull;

/**
 * Interface for non maven services component. All services manager need to be
 * instanciated by Ipojo. But a service manager should relies on one or several
 * services to carry computation. This interface is made to encapsulate this
 * kind of services to be able to swap them easily.
 * 
 * @author Bubul
 * @since 1.0
 */
public interface ROUTER_Service {

	/**
	 * Starts the services after it has been initialized.
	 */
	void start();

	/**
	 * Stop the service and put it in a state allowing to restart it.
	 */
	void stop();

	/**
	 * Dispose the service. Once disposed a service is not usable anymore until
	 * a new initialization is made.
	 */
	void dispose();

	/**
	 * Initialize the service to make it able to be started.
	 */
	void init();

	/**
	 * Notify this service that an event occurred.
	 * 
	 * @param event
	 */
	void notifyEvent(ROUTER_Event event);

	/**
	 * Getter for the service properties.
	 * 
	 * @return An array containing all the service fullfield properties.
	 */
	@Nonnull
	ROUTER_ServiceProperties[] getServiceProperties();

}
