package com.epicProjects.common.serviceRouter.api;

import javax.annotation.Nonnull;

/**
 * Enumeration of all service possible properties.
 * 
 * @author Bubul
 * @since 1.0
 */
public enum ROUTER_ServiceProperties {

	/** A view. */
	VIEW,

	/** A presenter. */
	PRESENTER,

	/** A manager for data I/O. */
	DATA_MANAGER,

	/** A manager for network communications. */
	NETWORK_MANAGER,

	/** A manager for data that should be persisted. */
	PERSISTANCE_MANAGER,

	/** A manager for Thread. */
	THREAD_MANAGER;

	/**
	 * A string qualifying a property.
	 */
	private String _propertieQualifier;

	/**
	 * Constructor.
	 * 
	 * @param qualifier
	 *            a qualifier to specify the property.
	 */
	private ROUTER_ServiceProperties() {
		_propertieQualifier = "UNQUALIFIED";
	}

	/**
	 * Sets the property qualifier
	 * 
	 * @param qualifier
	 *            the property qualifier to be settled;
	 */
	public void setQualifier(@Nonnull String qualifier) {
		_propertieQualifier = qualifier;
	}

	/**
	 * Getter for the property qualifier.
	 * 
	 * @return the property qualifier.
	 */
	@Nonnull
	public String getQualifier() {
		return _propertieQualifier;
	}

}
