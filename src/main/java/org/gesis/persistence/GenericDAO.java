package org.gesis.persistence;

import java.util.List;

/**
 * Generic DAO-class (Data Access Object), which defines some basic methods to
 * access objects of type <T>.
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
	 * Returns the object by the URN-property of Identifiable-class.
	 * 
	 * @param urn
	 * @return
	 */
	T getByURN( String urn );

	/**
	 * Returns a list of all objects.
	 * 
	 * @return
	 */
	List<T> getAll();

	/**
	 * Returns a list of all objects that are 'similar' to
	 * <i>exampleInstance</i>. With 'similar' is meant that the list of objects
	 * must have equal properties as <i>exampleInstance</i>, including relations
	 * to other objects.
	 * 
	 * @param exampleInstance
	 * @param excludeProperty
	 * @return
	 */
	List<T> getByExample( T exampleInstance, String... excludeProperty );

	/**
	 * Persists or updates <i>entity</i>.
	 * 
	 * @param entity
	 * @return
	 */
	T persist( T entity );

	/**
	 * Deletes <i>entity</i>.
	 * 
	 * @param entity
	 * @return
	 */
	boolean delete( T entity );
}
