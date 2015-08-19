package com.epicProjects.common.serviceRouter.api;

import java.util.List;

/**
 * Router meant to allow service management from service properties
 * 
 * @author Bubul
 * @since 1.0
 */
public interface ROUTER_ServicesRouter {

	/**
	 * Register a service to this router.
	 * 
	 * @param serviceInstance
	 *            the instance to be registered
	 * @param isPrimary
	 *            if true the service is marked as primary an is the default
	 *            service to be called for event pushing. If any services with
	 *            the same properties had already been registered as primary,
	 *            this service will be downgraded to ordinary service.
	 */
	void registerService(ROUTER_Service serviceInstance, boolean isPrimary);

	/**
	 * Unregister a service to this router.
	 * 
	 * @param serviceInstance
	 *            the instance to be unregistered
	 */
	void unregisterService(ROUTER_Service serviceInstance);

	/**
	 * Publish an event to all registered services that are targeted by the
	 * event.
	 * 
	 * @param event
	 *            the event to be published
	 */
	void publishEvent(ROUTER_Event event);

	/**
	 * Return the primary service that fulfilled a group of properties. If no
	 * primary service was registered, it will return the first services
	 * registered that fulfill the properties. If no services answer the
	 * properties a do nothing service instance will be returned.
	 * 
	 * @param serviceProperties
	 *            the group of properties the service should fulfilled
	 * @return the primary service if any or a do nothing service instance
	 *         otherwise
	 */
	ROUTER_Service getPrimaryServiceInstance(ROUTER_ServiceProperties[] serviceProperties);

	/**
	 * Return a list of all services that fulfilled a group of properties.
	 * 
	 * @param serviceProperties
	 *            the group of properties the services should fulfilled
	 * @return a list of all services that fulfilled the group of properties.
	 */
	List<ROUTER_Service> getAllServiceInstance(ROUTER_ServiceProperties[] serviceProperties);

}
