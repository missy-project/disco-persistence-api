package org.gesis.skos.persistence;

import java.util.List;

import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;
import org.gesis.skos.Concept;

/**
 * This interface handles a {@link Concept}. Methods which are specific for a
 * {@link Concept} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface ConceptDAO extends GenericDAO<Concept>, InstantiableDAO
{

	/**
	 * Returns a List of Concepts where property Concept.notation equals
	 * <i>notation</i>.
	 * 
	 * @param notation
	 * @return
	 */
	public List<Concept> getByNotation( String notation );
}
