package com.epicProjects.common.configuration.api;

/**
 * An application context. A context is a partially persistent element that
 * allow to share information between the application composant. The context is
 * initialized from configuration files and can be filled up from services to
 * share base information.
 * 
 * Be careful : filling the context will not put the information onto the disk
 * unless we save the context.
 * 
 * @author Bubul
 * 
 */
public interface CTX_Context {

	/**
	 * Get a data as a String.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @return the data.
	 */
	String getString(String dictionnaryName, String key);

	/**
	 * Get a data as a Boolean.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @return the data.
	 */
	boolean getBoolean(String dictionnaryName, String key);

	/**
	 * Get a data as a Integer.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @return the data.
	 */
	int getInteger(String dictionnaryName, String key);

	/**
	 * Get a data as a Float.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @return the data.
	 */
	float getFloat(String dictionnaryName, String key);

	/**
	 * Get a data as a Binary array.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @return the data.
	 */
	byte[] getBinary(String dictionnaryName, String key);

	/**
	 * Set a data as a String.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @param data
	 *            the data.
	 */
	void setString(String dictionnaryName, String key, String data);

	/**
	 * Set a data as a Boolean.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @param data
	 *            the data.
	 */
	void setBoolean(String dictionnaryName, String key, boolean data);

	/**
	 * Set a data as a Integer.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @param data
	 *            the data.
	 */
	void setInteger(String dictionnaryName, String key, int data);

	/**
	 * Set a data as a Float.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @param data
	 *            the data.
	 */
	void setFloat(String dictionnaryName, String key, float data);

	/**
	 * Set a data as a Binary array.
	 * 
	 * @param dictionnaryName
	 *            the dictionary name to find the data in
	 * @param key
	 *            name of the data
	 * @param data
	 *            the data.
	 */
	void setBinary(String dictionnaryName, String key, byte[] data);
}
