package com.epicProjects.common.configuration.api;

/**
 * The context manager.
 * 
 * @author Bubul
 *
 */
public interface CTX_ContextManager {

	/**
	 * Get the current application context.
	 * @return the current context.
	 */
	CTX_Context getContext();
	
	/**
	 * Save the current context onto the disk.
	 */
	void saveContext();
	
}
