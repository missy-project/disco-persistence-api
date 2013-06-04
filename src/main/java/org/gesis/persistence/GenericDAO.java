package org.gesis.persistence;

import java.util.List;

/**
 * Generic Data Access Object class which defines some basic methods to access
 * objects of type <T>.
 * 
 * @author matthaeus
 * 
 * @param <T>
 */
public interface GenericDAO<T>
{

	/**
	 * Returns the object by id.
	 * 
	 * @param id
	 * @param lock
	 * @return
	 */
	T getById( String urn, boolean lock );

	/**
	 * Returns a list of all objects.
	 * 
	 * @return
	 */
	List<T> getAll();

	List<T> getByExample( T exampleInstance, String... excludeProperty );

	T persist( T entity );

	boolean delete( T entity );
}
