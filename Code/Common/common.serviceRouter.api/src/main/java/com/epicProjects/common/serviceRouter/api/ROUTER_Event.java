package com.epicProjects.common.serviceRouter.api;

import java.util.List;

/**
 * A service event.
 * 
 * @author Bubul
 * @since 1.0
 *
 */
public interface ROUTER_Event {

	/**
	 * Getter for the service that create that event.
	 * 
	 * @return the source of this event
	 */
	ROUTER_Service getEventSource();

	/**
	 * Getter for the properties to used to recognize the targeted services.
	 * 
	 * @return a list of service properties to be fullfiled by a service to be
	 *         notified for this event.
	 */
	List<ROUTER_ServiceProperties> getTargetedServicesPropeties();

}
