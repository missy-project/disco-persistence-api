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
	 * Returns the object by <i>id</i>. With <i>id</id> is meant the technical
	 * id of an object by means of the physical data storage that is used. This
	 * <i>id</i> is not considered as the functional identifier of an object of
	 * type T. For instance, in case a relational database is used the id could
	 * be a uuid.
	 * 
	 * @param id
	 * @param lock
	 * @return
	 */
	T getById( String id, boolean lock );

	/**
	 * Returns the object by <i>URN</i>. The <i>URN</i> is considered the
	 * functional identifier for an object.
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
