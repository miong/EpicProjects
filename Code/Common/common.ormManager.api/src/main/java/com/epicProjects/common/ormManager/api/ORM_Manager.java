package com.epicProjects.common.ormManager.api;

import com.epicProjects.common.serviceRouter.api.ROUTER_Service;

/**
 * Manager to be used to store data.
 * 
 * @author Bubul
 * @since 1.0
 */
public interface ORM_Manager extends ROUTER_Service {

	void createOrUpdate(ORM_PersistentData data);
	
	void merge(ORM_PersistentData data);
	
	void refresh(ORM_PersistentData data);
	
	void initializeStorageFor(Class dataClass);
	
}
