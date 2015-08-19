package com.epicProjects.common.ormManager.api;

/**
 * Interface of a persistent data. A persistent data is an object that should be
 * stored partially or completely to be recover into the next use of the
 * program.
 * 
 * This interface is based on lower service such as ormlite to carry the burden
 * of selected the field that should be stored.
 * 
 * The storage is based from anotation onto field and thats why the
 * serialization do not return anything.
 * 
 * 
 * @author Bubul
 * @since 1.0
 */
public interface ORM_PersistentData {

	/** Prepare the object to be stored. */
	void serialize();

	/** Recover the object from the its part that have been stored. */
	void deserialize();
}
